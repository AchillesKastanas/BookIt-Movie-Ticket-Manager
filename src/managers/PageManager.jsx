import React, { useState } from "react";

import LoginPage from "../pages/LoginPage";
import HomePage from "../pages/HomePage";
import RootPage from "../pages/RootPage";
import Navbar from "../components/general/Navbar";

const AuthManager = () => {
	const [isLoggedIn, setIsLoggedIn] = useState(true);
	//Check session storage if a valid JWT exists

	return isLoggedIn ? (
		<>
			<Navbar />
			<RootPage></RootPage>
		</>
	) : (
		<LoginPage></LoginPage>
	);
};

export default AuthManager;

import {BrowserRouter, Route, Routes} from "react-router-dom";
import LoginPage from "./pages/LoginPage";
import RegisterPage from "./pages/RegisterPage";
import MainPage from "./pages/MainPage";
import WelcomePage from "./pages/WelcomePage";


export default function App(){
    return(
        <BrowserRouter>
            <Routes>
                <Route path={"/"} element={<WelcomePage/>}/>
                <Route path={"/login"} element={<LoginPage/>}/>
                <Route path={"/register"} element={<RegisterPage/>}/>
                <Route path={"/main"} element={<MainPage/>}/>
            </Routes>
        </BrowserRouter>
    )
}
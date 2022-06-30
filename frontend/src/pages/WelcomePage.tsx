import {useNavigate} from "react-router-dom";


export default function WelcomePage(){

    const nav = useNavigate()

    return(
        <div>
            <button onClick={()=>nav("/login")}>Login</button>
            <button onClick={()=>nav("/register")}>Register</button>
        </div>
    )
}
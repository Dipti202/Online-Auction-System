import React from 'react'
import { Outlet,Navigate } from 'react-router-dom';
import { isLoggedIn } from '../auth';

const Privateroute=()=> {

 //   let loggedIn = false;

    // if(isLoggedIn()){
    //     return <Outlet />
    // }else{
    //     return <Navigate to={"/login"}/>;
    // }

return isLoggedIn() ? <Outlet /> : <Navigate to={"/login"}/>;


//   return (
//    <>
//     <div>this is private Route</div>

//  {/* for showing user content after hitting /user/dashboard */}
//     <Outlet />

//    </>
    
//  )
}

export default Privateroute;
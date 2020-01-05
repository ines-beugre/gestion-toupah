import React from 'react';
import ReactDOM from 'react-dom';
import dotenv from 'dotenv';
import App from './app';


dotenv.config();
function addScript() {
    let script = document.createElement("script");
    // script.src = `http://${process.env.URL_DEV}:35729/livereload.js`;
    console.log("hello");
    script.src = `http://localhost:35729/livereload.js`;
    document.body.appendChild(script);
    script.onload = (loadPage) => {
        ReactDOM
            .render(
                <App/>,
                document
                    .getElementById(
                        'app'
                    )
            )
        ;
    }

}

addScript();

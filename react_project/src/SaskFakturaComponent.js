import React from 'react';
import axios from 'axios';

this.handleClick = () => {
    console.log('this is:', this);
    //console.log('http://localhost:8080/api/saskaitafaktura/' + {props.id})
    // axios.delete('http://localhost:8080/api/saskaitafaktura/' + {props.id});
}


const SaskFakturaComponent =(props)=>{
    return(
        <table class="table">
        <thead >
        <tr>
            <th scope="col">numeris</th>
            <th scope="col">išrašymo data</th>
            <th scope="col">gavėjas</th>
            <th scope="col">handle</th>
        </tr>
        </thead>
        <tbody>
        <tr class="info">
            <td>{props.numeris}</td>
            <td>{props.israsymoData}</td>
            <td>{props.gavejas}</td>
            <td><button className="btn btn-info" onClick={(e) => this.handleClick(e)}>Delete</button></td>
        </tr>
        </tbody>
        </table>
    )
}
export default SaskFakturaComponent;
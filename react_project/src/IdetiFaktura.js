import React, {Component} from 'react';
import axios from 'axios';

class IdetiFaktura extends Component
{
    state = 
    {
        numeris:'',
        israsymoData:'',
        gavejas:''    
    }

    handleChange = event => 
    {
        this.state({ numeris: event.target.value });
    }

    handleSubmit = event =>
    {
        event.preventDefault();

        const saskaita = 
        {
            numeris: this.state.numeris,
            israsymoData: this.state.israsymoData,
            gavejas: this.state.gavejas
        };

        axios.post('http://localhost:8080/api/saskaitafaktura/post', {saskaita})
            .then(res =>
                {
                    console.log(res);
                    console.log(res.data);
                })
    }

    render()
    {
        return
        (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <label>
                        numeris :
                        <input type="text" name="numeris" onChange={this.handleChange}/>
                        israsymoData :
                        <input type="text" name="israsymoData" onChange={this.handleChange}/>
                         gavejas :
                        <input type="text" name="gavejas" onChange={this.handleChange}/>
                    </label>
                </form>
            </div>
        )
    }
}


export default IdetiFaktura;
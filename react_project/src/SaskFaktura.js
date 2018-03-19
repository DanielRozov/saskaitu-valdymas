import React, {Component} from 'react';
import axios from 'axios';
import SaskFakturaComponent from './SaskFakturaComponent';

//import './SaskFaktura.css';


class SaskFaktura extends Component {

    constructor(props){
        super(props)
        this.state ={
            saskaituList:[]
        }
    }

    componentDidMount() {
        let self = this;
    	axios.get('http://localhost:8080/api/saskaitafaktura/get')
        .then(function(result) {
            self.setState({
                saskaituList: result.data
            });
          })
    }

    render()
    {
        let saskaitos = this.state.saskaituList.map(
            (saskItem) => {
                return <SaskFakturaComponent key={saskItem.id} numeris={saskItem.numeris} israsymoData = {saskItem.israsymoData} gavejas = {saskItem.gavejas}/>
            })
        return(
            <table>
                {saskaitos}
            </table>
        )
    }

    // state = {
    //     saskaitos: []
    // }

    // componentDidMount() {
    //     axios.get('http://localhost:8080/api/saskaitafaktura/get')
    //         .then(res => {
    //             const saskaitos = res.data;
    //             this.setState({
    //                 saskaitos
    //             });
    //         })
    // }

    // render() {
    //     let saskaitos = this.state.saskaitos.map(
    //         (saskItem) => {
    //             return <SaskFakturaComponent key = {
    //                 saskItem.id
    //             }
    //             numeris = {
    //                 saskItem.numeris
    //             }
    //             israsymoData = {
    //                 saskItem.israsymoData
    //             }
    //             gavejas = {
    //                 saskItem.gavejas
    //             }
    //             />
    //         })
    //     return ( <table> {saskaitos} </table>)
    // }
}

export default SaskFaktura;
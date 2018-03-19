import React, { Component } from 'react';
import './App.css';
import SaskFaktura from './SaskFaktura';
import IdetiFaktura from './IdetiFaktura';

class App extends Component {
  render() {
    return (
      <div className="App">
       <SaskFaktura/>
       {/* <IdetiFaktura/> */}
      </div>
    );
  }
}

export default App;

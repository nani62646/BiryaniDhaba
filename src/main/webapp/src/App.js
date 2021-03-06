import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
	
	  componentDidMount() {
		  this.setState({isLoading: true});

		  fetch('http://localhost:8080/getMenu')
		    .then(response => response.json())
		    .then(data => this.setState({beers: data, isLoading: false}));
		}
	  
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
      </div>
    );
  }
  

}

export default App;

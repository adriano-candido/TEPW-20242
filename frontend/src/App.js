import React from 'react';
import Header from './Header';

export default function App() {
  let counter=0;

  function increment(){
    counter++;
    console.log(counter);
  }

  return (
    <div>
    <Header>
      Titulo passado via children (Propriedade)
      <h1>Contador: {counter}</h1>
    </Header>
    <button onClick={increment}>Add</button>
    </div>

  );
}

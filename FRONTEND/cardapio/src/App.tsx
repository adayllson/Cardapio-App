import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { FoodData } from './inteface/FoodData';
import { Card } from './components/card/card';

function App() {
  const data: FoodData[] = [];

  return (
    <div className="container">
      <h1>Cardápio</h1>
      <div className="card-grid">
          {data.map(foodData => <Card 
          price={foodData.price} 
          title={foodData.title} 
          image={foodData.image}/>)}
      </div>
    </div>
  )
}

export default App

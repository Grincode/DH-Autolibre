import React, { useEffect, useState } from 'react';

export const Home = () => {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch("http://localhost:8080/api/message")
      .then((response) => response.text())
      .then((data) => setMessage(data))
      .catch((error) => console.error("Error al obtener el mensaje:", error));
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <h1>{message || "Loading..."}</h1>
      </header>
    </div>
  );
};

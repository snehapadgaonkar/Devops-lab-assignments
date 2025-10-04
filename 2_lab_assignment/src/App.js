import React, { useState, useEffect } from "react";
import "./App.css";

function App() {
  const [darkMode, setDarkMode] = useState(true);

  useEffect(() => {
    document.body.className = darkMode ? "dark-mode" : "light-mode";
  }, [darkMode]);

  return (
    <div className="App">
      <header className="App-header">
        <h1>🚀 React + Docker Demo</h1>
        <p>This React app is running inside a Docker container!</p>
        <button className="toggle-btn" onClick={() => setDarkMode(!darkMode)}>
          {darkMode ? "☀️ Switch to Light Mode" : "🌙 Switch to Dark Mode"}
        </button>
      </header>

      <main>
        <h2>Container Status: ✅ Running</h2>
        <p>Environment: {process.env.NODE_ENV || "development"}</p>
        <p>Build Time: {new Date().toLocaleString()}</p>
      </main>
    </div>
  );
}

export default App;
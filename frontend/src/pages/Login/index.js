import React from 'react';
import './style.css';

import logoImage from '../../assets/logo.png';
import padlock from '../../assets/padlock.png';

export default function Login() {
  return (
   <div className="login-container">
      <section className="form">
        <img src={logoImage} alt="Imagem Logo Unichristus" />
        <form>
          <h1>Acesse sua conta</h1>
          <input placeholder="Usuário"/>
          <input type="password" placeholder="Senha"/>
          <button className="button" type="submit">Entrar</button>
        </form>
      </section>
      <img src={padlock} alt="Imagem Cadeado" />
   </div>

  );
}
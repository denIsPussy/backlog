// Header.js
import React from 'react';
import { Navbar, Nav, Container, Button, NavLink } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import "./header.css"

const Header = () => {
    const username = localStorage.getItem('username'); // Получаем имя пользователя из localStorage

    const handleLogout = () => {
        localStorage.removeItem('username'); // Удаляем пользователя из localStorage
        window.location.reload(); // Перезагружаем страницу для обновления состояния
    };

    return (
        <Navbar bg="dark" variant="dark" expand="lg" className="header-nav">
            <Container>
                <Navbar.Brand as={Link} to="/" className="navbar-brand-logo">Backlog</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="ms-auto">
                        {username ? (
                            <>
                                <Nav.Item className="me-3 text-white d-flex align-items-center">Привет, {username}</Nav.Item>
                                <Button variant="outline-danger" onClick={handleLogout}>Выйти</Button>
                            </>
                        ) : (
                            <>
                                <NavLink as={Link} to="/login" className="nav-link">Авторизация</NavLink>
                                <NavLink as={Link} to="/register" className="nav-link">Регистрация</NavLink>
                            </>
                        )}
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
};

export default Header;

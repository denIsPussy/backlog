// src/pages/CartPage.js
import React from 'react';
import ShoppingCart from '../components/ShoppingCart';

const CartPage = () => {
    const cartId = localStorage.getItem(); // Замените на актуальный идентификатор корзины

    return (
        <div className="cart-page">
            <h1>Your Shopping Cart</h1>
            <ShoppingCart cartId={cartId} />
        </div>
    );
};

export default CartPage;

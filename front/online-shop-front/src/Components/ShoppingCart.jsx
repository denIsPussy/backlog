// src/components/ShoppingCart.js
import React, { useEffect, useState } from 'react';
import { getShoppingCart } from '../services/cartService';
import CartItem from './CartItem';

const ShoppingCart = ({ cartId }) => {
    const [cart, setCart] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchCart = async () => {
            try {
                const data = await getShoppingCart(cartId);
                setCart(data);
            } catch (error) {
                setError(error);
            } finally {
                setLoading(false);
            }
        };

        fetchCart();
    }, [cartId]);

    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error: {error.message}</p>;

    return (
        <div className="shopping-cart">
            <h2>Shopping Cart</h2>
            {cart.cartItems.length === 0 ? (
                <p>Your cart is empty.</p>
            ) : (
                cart.cartItems.map(item => <CartItem key={item.id} item={item} />)
            )}
        </div>
    );
};

export default ShoppingCart;

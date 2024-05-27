import React from 'react';

const CartItem = ({ item }) => {
    return (
        <div className="cart-item">
            <h3>{item.product.name}</h3>
            <p>Price: ${item.product.price}</p>
            <p>Quantity: {item.quantity}</p>
        </div>
    );
};

export default CartItem;
package com.Tienda.service;

import com.Tienda.domain.Carrito;

public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(Long idCliente);
    
    
}

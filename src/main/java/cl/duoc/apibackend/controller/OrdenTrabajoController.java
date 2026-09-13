package cl.duoc.apibackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Agregamos "/api/orders" para que coincida con la llamada del frontend
@RequestMapping({"/api/ordenes", "/v1/ordenes", "/api/orders"})
public class OrdenTrabajoController {

    @GetMapping
    // Ajustamos el scope para que coincida con el token que envía Angular
    @PreAuthorize("hasAuthority('SCOPE_access_as_user2')")
    public String obtenerOrdenes() {
        return "API protegida - acceso autorizado con access_as_user2";
    }
}
# Changelog

## [v0.1.0]
### Añadido
- Inicialización del microservicio `Backend-cloud-auth` configurado con Spring Security OAuth2 Client.
- Implementación de `SecurityConfig` usando `oauth2Login()` para actuar como BFF (Backend For Frontend) delegando el inicio de sesión a Azure AD.
- `AuthController` añadido para retornar los atributos de la sesión autenticada.
- `application.yml` configurado con Client ID y Tenant ID de Azure.
- `Dockerfile` multi-stage para compilar y ejecutar el proyecto optimizado en EC2.
- `README.md` con instrucciones para el despliegue manual en EC2 independiente usando `docker run`.

# Microservicio de Autenticación (BFF)

Este microservicio se encarga de iniciar sesión con Azure AD (OAuth2 Client) y mantener la sesión del usuario.

## Despliegue en EC2 con Docker Run

1. **Construir la imagen**:
   ```bash
   docker build -t auth_app .
   ```

2. **Levantar el microservicio**:
   (Asegúrate de pasar tu secreto de cliente real en `AZURE_CLIENT_SECRET`)
   ```bash
   docker run -d \
     --name auth_app \
     -p 8080:8080 \
     -e AZURE_CLIENT_SECRET=tu_secreto_aqui \
     auth_app
   ```

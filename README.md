# 📚 Sistema de Gestión de Biblioteca

Aplicación de escritorio robusta con arquitectura cliente-servidor desarrollada en Java para la administración eficiente del catálogo, usuarios y transacciones de una biblioteca.

## 🚀 Características Principales
* **Gestión de Inventario:** Módulo para el control de altas, bajas y modificaciones de diferentes tipos de publicaciones (libros, mangas, novelas ligeras).
* **Control de Transacciones:** Sistema de préstamos, devoluciones y ventas.
* **Generación de Comprobantes:** Creación automática de tickets y recibos en formato PDF al finalizar una compra o préstamo.
* **Arquitectura Multihilo:** Manejo de peticiones simultáneas para garantizar una experiencia de usuario fluida y sin bloqueos.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java SE (Interfaces gráficas con Java Swing)
* **Base de Datos:** MySQL (Modelado relacional y conectividad)
* **Librerías Adicionales:** JDBC (Conector MySQL), iText (Generación de PDFs)
* **Entorno de Desarrollo:** NetBeans IDE

## 📸 Interfaz Gráfica
<img width="844" height="504" alt="image" src="https://github.com/user-attachments/assets/7500e86f-a749-4d32-a907-82c2678ad345" />
<img width="655" height="707" alt="image" src="https://github.com/user-attachments/assets/bbf7c386-17c3-4cdb-aeae-01a192e91447" />
<img width="952" height="722" alt="image" src="https://github.com/user-attachments/assets/1ff3ef87-1ec4-45d3-8ed1-dc386d1be1c7" />
<img width="848" height="660" alt="image" src="https://github.com/user-attachments/assets/ab3fe7cf-926c-4d84-ab96-0d38c014612c" />
<img width="709" height="383" alt="image" src="https://github.com/user-attachments/assets/c28cc93d-a799-46e2-b8dd-161ef576830b" />
<img width="926" height="612" alt="image" src="https://github.com/user-attachments/assets/e7ff73e5-4bd9-45cc-afd5-f5b3ceace042" />
<img width="791" height="472" alt="image" src="https://github.com/user-attachments/assets/3d153887-ff49-477e-9f4d-fb8957b6ba3f" />


---

## ⚙️ Prerrequisitos

Sigue atentamente estos pasos para poder ejecutar este entorno de manera local en tu computadora sin errores de compilación ni de conexión.

### 📋 Prerrequisitos
* **Java Development Kit (JDK):** Versión 17 o superior instalada.
* **Gestor de Base de Datos:** MySQL Server (ya sea nativo, mediante XAMPP o MySQL Workbench).
* **Entorno de Desarrollo (IDE):** NetBeans IDE (o cualquier IDE compatible con proyectos Java Ant).

### 🛠️ Guía de Configuración Paso a Paso

**1. Clonar el repositorio:**
```bash
git clone [https://github.com/JohnCharly05/sistema-gestion-biblioteca.git](https://github.com/JohnCharly05/sistema-gestion-biblioteca.git)
```

**2. Configurar la Base de Datos en MySQL**
* Abre tu gestor de base de datos preferido (MySQL Workbench, phpMyAdmin, etc.).
* Crea una nueva base de datos vacía llamada exactamente `LIBRERIA`.
* Importa y ejecuta el script de base de datos `LIBRERIA.sql` que se encuentra en la raíz de este repositorio para construir automáticamente todas las tablas, relaciones e inventario inicial.

**3. Configurar Credenciales de Conexión en el Código**
* Abre el proyecto dentro de NetBeans IDE.
* En el explorador de proyectos de la izquierda, navega por la ruta: `Source Packages` -> `com.login` y abre el archivo `Conexion.java`.
* Modifica las variables de conexión colocándole tu usuario y tu contraseña local de acceso a MySQL:

```java
static String url = "jdbc:mysql://localhost:3306/LIBRERIA";
static String user = "TU_USUARIO_DE_MYSQL";     // Por defecto suele ser "root"
static String pass = "TU_CONTRASENA_DE_MYSQL";  // Coloca aquí tu contraseña local
```

**4. Compilar y Ejecutar**
* **Librerías incluidas:** No requieres descargar conectores adicionales. Las dependencias indispensables (`mysql-connector-j` para la base de datos e `iText` para la edición de documentos) ya vienen preconfiguradas e integradas de forma relativa dentro de la ruta del proyecto en `src/lib/`.
* **Ejecución:** Haz clic derecho sobre el nodo raíz del proyecto en NetBeans y selecciona **Clean and Build** (Limpiar y Construir). Una vez terminado el proceso con éxito, haz clic en **Run** (Ejecutar) en la clase `Login.java`.

---

## 📄 Nota sobre los Comprobantes en PDF
Al concluir operaciones críticas dentro del sistema (como el corte de caja o el proceso de ventas), la aplicación genera un ticket formal en formato PDF de manera automatizada. 

Gracias al uso de propiedades dinámicas del entorno (`System.getProperty("user.home")`), el archivo final se guardará directamente en el directorio principal de tu usuario activo en el sistema operativo, garantizando una portabilidad absoluta e inmediata sin importar si ejecutas el sistema desde entornos Windows, Linux o macOS.

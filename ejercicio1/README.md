# Ejercicio 1 — Builder (Automóvil) **(sin Director)**

**Patrón:** Builder (Creacional)  
**Por qué:** Elegimos Builder porque el modelo Automovil tiene múltiples opciones configurables. El patrón evita el constructor telescópico (múltiples sobrecargas con parámetros posicionales), mejora la legibilidad al usar métodos con nombre y asegura un objeto final inmutable. Centralizamos defaults y validaciones en build(), lo que facilita la evolución del modelo sin romper firmas ni duplicar lógica. En comparación, el enfoque telescópico incrementa la probabilidad de errores por orden de argumentos y dificulta el mantenimiento.

## Cómo ejecutar

### Opción 1 — IDE (VS Code / IntelliJ)
Abre `src/main/java/com/patrones/autos/ej1/Main.java` y ejecuta **Run**.

### Opción 2 — Consola (Maven)
Compilar y ejecutar el `main` explícitamente:
EN ejercicio1 ejecutar:
mvn -q -DskipTests exec:java o
```bash
mvn -q -DskipTests exec:java -Dexec.mainClass=com.patrones.autos.ej1.Main
 
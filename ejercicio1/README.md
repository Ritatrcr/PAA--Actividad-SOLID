# Ejercicio 1 — Builder (Automóvil) **(sin Director)**

**Patrón:** Builder (Creacional)  
**Por qué:** Evita el “constructor telescópico”; permite construir objetos complejos de forma **fluida** y dejar el objeto final **inmutable**. No usamos `Director` porque las “recetas” predefinidas no son requisito: construimos directamente con el `AutomovilBuilder`.

## Cómo ejecutar

### Opción 1 — IDE (VS Code / IntelliJ)
Abre `src/main/java/com/patrones/autos/ej1/Main.java` y ejecuta **Run**.

### Opción 2 — Consola (Maven)
Compilar y ejecutar el `main` explícitamente:
EN ejercicio1 ejecutar:
mvn -q -DskipTests exec:java o
```bash
mvn -q -DskipTests exec:java -Dexec.mainClass=com.patrones.autos.ej1.Main

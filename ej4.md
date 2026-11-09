# Ejercicio 4: EspacioUniversitario

## Explicación Lógica
1. **Inspección de Tipos (`instanceof`):** Comprueba defensivamente en tiempo de ejecución a qué subclase concreta pertenece la instancia recibida.
2. **Downcasting Seguro:** Permite realizar el moldeo explícito `(Laboratorio) espacio` o `(AulaMagna) espacio` garantizando que no se genere la excepción `ClassCastException`.
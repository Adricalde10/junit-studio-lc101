#  BalancedBrackets

### 1. Casos Básicos

#### Caso 1: Cadena vacía
- Entrada: ""
- Salida Esperada: Verdadero (true)

#### Caso 2: Solo corchetes simples
- Entrada: "[]", "{}", "()"
- Salida : Verdadero (true)

#### Caso 3: Corchetes anidados
- Entrada: "[{()}]", "{[()]}"
- Salida Esperada: Verdadero (true)

### Caso 4: Corchetes desbalanceados simples
- Entrada: "[", "]", "{"
- Salida Esperada: Falso (false)

#### Caso 5: Corchetes desbalanceados anidados
- Entrada: "[{)]"
- Salida Esperada: Falso (false)

#### Caso 6: Cadena larga balanceada
- Entrada: "((((((()))))))", "[[[]]]", "{{{{{{}}}}}}"
- **Salida Esperada**: Verdadero (true)

#### Caso 7: Cadena con solo corchetes
- Entrada: "[[[[[[[]]]]]]]", "{{{{{{{{}}}}}}}}"
- Salida Esperada: Verdadero (true)

#### Caso 8: Cadena larga desbalanceada
- **Entrada**: "(((((())", "{[[[}", "{{{{{{}}}}"
- **Salida Esperada**: Falso (false)

#### Caso 9: Orden incorrecto de corchetes
- **Entrada**: ")[", "{)", "(]"
- **Salida Esperada**: Falso (false)

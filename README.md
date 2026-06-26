## Caso: sistema de empleados

Una empresa tiene diferentes tipo de empleados:
- Empleados administrativos
- Empleados de ventas
- Empleados de soporte

Todos los empleados tienen:
- Código
- Nombre
- Sueldo

Además, cada tipo de empleado tiene características específicas.

```plantuml
@startuml

class Employee {
    - id: String
    - name: String
    - salary: Double

    + showInformation(): void
    + calculateSalary(): Double
}

class AdministrativeEmployee {
    - bonus: Double
}

class SalesEmployee {
    - commission: Double
}

class SupportEmployee {
    - overtimeHours: int
}


Employee <|-- AdministrativeEmployee
Employee <|-- SalesEmployee
Employee <|-- SupportEmployee

@enduml
```
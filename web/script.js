document.addEventListener('DOMContentLoaded', function() {
    const empleados = document.getElementById('empleados');

    // Crear objetos Empleado
    const empleado1 = new Empleado("Juana", "Pérez", 5000);
    const empleado2 = new Empleado("María", "López", 6000);

    // Mostrar salario de cada empleado
    mostrarEmpleado(empleado1);
    mostrarEmpleado(empleado2);

    // Dar a cada empleado un aumento del 10%
    empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.1);
    empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.1);

    // Mostrar salario anual de cada empleado después del aumento
    mostrarEmpleado(empleado1);
    mostrarEmpleado(empleado2);

    // Mostrar el contador de empleados
    mostrarContadorEmpleados();

    // Función para mostrar un empleado
    function mostrarEmpleado(empleado) {
        const divEmpleado = document.createElement('div');
        divEmpleado.classList.add('empleado');
        divEmpleado.innerHTML = `
            <p>Nombre: ${empleado.getNombre()} ${empleado.getApellido()}</p>
            <p>Salario Mensual: $${empleado.getSalarioMensual()}</p>
            <p>Salario Anual: $${empleado.getSalarioAnual()}</p>
        `;
        empleados.appendChild(divEmpleado);
    }

    // Función para mostrar el contador de empleados
    function mostrarContadorEmpleados() {
        const totalEmpleados = document.createElement('p');
        totalEmpleados.textContent = `Total de empleados: ${Empleado.getContadorEmpleados()}`;
        empleados.appendChild(totalEmpleados);
    }
});

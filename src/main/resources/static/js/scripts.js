document.getElementById('loginForm').addEventListener('submit', function(event) {
    console.log('Form submitted');
    console.log('JavaScript is working!');
    event.preventDefault();

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    if (username === '' || password === '') {
        alert('Please fill in all fields.');
        return;
    }

    // Aquí puedes agregar tu lógica de autenticación
    console.log('Username:', username);
    console.log('Password:', password);

    alert('Login successful!');

	// window.location.href = '/';
    // Redirigir o realizar otra acción después del inicio de sesión exitoso
});
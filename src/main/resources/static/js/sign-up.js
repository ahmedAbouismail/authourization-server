const form = document.getElementById('signUpForm');




const matchingPassword = document.getElementById('passwordMatchingField');

//space not allowed
const reSpaces = /^\S*$/;

function validateFirstName() {
    const firstName = document.getElementById('firstnameField');
    if (reSpaces.test(firstName.value)){
        firstName.classList.remove('is-invalid');
        firstName.classList.add('is-valid');

        return true;
    }else{
        firstName.classList.remove('is-valid');
        firstName.classList.add('is-invalid');

        return false;
    }
}

function validateLastName() {
    const lastName = document.getElementById('lastnameField');
    if (reSpaces.test(lastName.value)){
        lastName.classList.remove('is-invalid');
        lastName.classList.add('is-valid');

        return true;
    }else{
        lastName.classList.remove('is-valid');
        lastName.classList.add('is-invalid');

        return false;
    }
}

function validateEmail() {
    const email = document.getElementById('emailField');
    const reEmail = /^([a-zA-Z0-9_\-?\.?]){3,}@([a-zA-Z]){3,}\.([a-zA-Z]){2,5}$/;

    if (reEmail.test(email.value)){
        email.classList.remove('is-invalid');
        email.classList.add('is-valid');

        return true;
    }else{
        email.classList.remove('is-valid');
        email.classList.add('is-invalid');

        return false;
    }
}

function validatePassword() {
    const password = document.getElementById('password');
    const rePassword = /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})(?=.*[!@#$%^&*])/;
    if (rePassword.test(password.value)){
        password.classList.remove('is-invalid');
        password.classList.add('is-valid');

        return true;
    }else{
        password.classList.remove('is-valid');
        password.classList.add('is-invalid');

        return false;
    }
}

(function () {
    'use strict'

    var forms = document.querySelectorAll('.needs-validation')

    // Loop over them and prevent submission
    Array.prototype.slice.call(forms)
        .forEach(function (form) {
            form.addEventListener('submit', function (event) {
                if (!form.checkValidity() || !validateFirstName() || !validateLastName() || !validateEmail() || !validatePassword()) {
                    event.preventDefault()
                    event.stopPropagation()
                }

                form.classList.add('was-validated')
            }, false)
        })
})()
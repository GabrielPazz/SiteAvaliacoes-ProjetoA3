let btn = document.querySelector('.fa-eye')

function changeType()
{
    var inputPassword = document.getElementById('password');

    if (inputPassword)
    {
        console.log("encontrado");

        if (inputPassword.getAttribute('type') == 'password')
        {
            inputPassword.setAttribute('type', 'text') 
        } else 
        {
            inputPassword.setAttribute('type', 'password')
        }
    } else
    {
        console.warn("inputPassword não encontrado")
    }
}
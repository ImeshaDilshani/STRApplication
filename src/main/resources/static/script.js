$(document).ready(function(){
    $('#birth-date').mask('00/00/0000');
    $('#phone-number').mask('0000-0000');
})

function saveStudent(){
    let firstName = $('#firstName').val();
    let lastName = $('#lastName').val();
    let age = $('#age').val();
    let email = $('#email').val();
    //let phoneNo = $('#phoneNo');
    let address = $('#address').val();

    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/student/saveStudent",
        async:true,
        data:JSON.stringify({
            "id":"",
            "firstname":firstName,
            "lastname":lastName,
            "age":age,
            "email":email,
            //"phoneNo":phoneNo,
            "address":address
        }),

        success:function (data) {
            alert("saved")
        },

        success:function (xhr, exception) {
            alert("Error")
        }
    })
}
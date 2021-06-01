$(document).ready(function () {
         $("#studentsTable").click(function () {
             var person = {};
             person.stu_id = $("#stu_id").val();
             person.name = $("#name").val();
             person.age=$("#age").val();
             person.address=$("#address").val();
             person.dept = $("#dept").val();
 person.pNo = $("#pNo").val();
             $.ajax({
                 type: "POST",
                 url: "updateStudent",
                 data: JSON.stringify(person) ,
                 contentType : "application/json",

                 success: function (response) {

                     $("#name").text("name:- " + response.name);
                     $("#age").text("age:- " + response.age);
                     $("#address").text("address:- " + response.address);
                     $("#dept").text("dept:- " + response.dept);
                     $("#pNo").text("dept:- " + response.pNo);
                     alert("Success");
                 },
                 failure: function (response) {
                     alert("Failed");
                 }
             });
         });
     });



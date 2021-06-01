const queryString = window.location.search;
const urlParams = new URLSearchParams(queryString);
const page_type4 = urlParams.get('stuId')
const page_type = urlParams.get('name')
const page_type1 = urlParams.get('age')
const page_type2 = urlParams.get('address')
const page_type3 = urlParams.get('dept')
const page_type5 = urlParams.get('pno')

$(document).ready(function () {
$("#form").validate({
rules:{
name:{
 "required":true,
},
age:{
 "required":true,
},
address:{
 "required":true,
},
dept:{
 "required":true,
},
pno:{
 "required":true,
}
},
messages:{
name:{
"required":"Enter the name",
},
age:{
"required":"Enter the age",
},
address:{
"required":"Enter the address",
},
dept:{
"required":"Enter the dept",
},
pno:{
"required":"Enter the pno",
}

},


});
alert("studId"+page_type4);

     $("#name").val(page_type);
     $("#age").val(parseInt(page_type1));
     $("#address").val(page_type2);
     $("#dept").val(page_type3);
     $("#pno").val(page_type5);

         $("#submit").click(function () {


         if(!$("#form").valid()){

         return false;
         }
             var person = {};
             if(page_type4 >0){
             person.studId=page_type4;
             }
             person.name = $("#name").val();
             person.age=$("#age").val();
             person.address=$("#address").val();
             person.dept = $("#dept").val();
             person.pno = $("#pno").val();
             $.ajax({
                 type: "POST",
                 url: page_type4 >0?"updateStudent":"createStudent"  ,
                 data: JSON.stringify(person) ,
                 contentType : "application/json",

                 success: function (response) {
                     $("#name").text("name:- " + response.name);
                     $("#age").text("age:- " + response.age);
                     $("#address").text("address:- " + response.address);
                     $("#dept").text("dept:- " + response.dept);
                     $("#pno").text("pno:- " + response.pno);


                     if(response.status == "SUCCESS"){
                      $("#success_text").text("success " );
                     $("#success").show();
                     }
                     else{
                     $("#text").text(response.errorMessage);

                                         $("#failure").show();
                                         alert("failure")
                     }


                 },
                 failure: function (response) {
                                }
             });
         });
     });




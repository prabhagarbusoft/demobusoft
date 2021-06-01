var student;
$(document).ready(function(){
student=$('#studentsTable').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false,
      "responsive": true,
    });
      var saveData = $.ajax({
          type: 'POST',
          url: "loadStudents",
          data : JSON.stringify({}),
          contentType : "application/json",
          success: function(resultData) {

          var htm = '';
          $.each(resultData.studentdos, function(index, student){
            htm += '<tr><td>'+student.stuId+'</td>'+
                   '<td>'+student.name+'</td>'+
                   '<td>'+student.age+'</td>'+
                   '<td>'+student.address+'</td>'+
                   '<td>'+student.dept+'</td>'+
                   '<td>'+student.pno+'</td>'+

                   '<td> <a href="students?studId='+student.stuId+'&name='+student.name+'&age='+student.age+' &address='+student.address+' &dept='+student.dept+' &pNo='+student.p_no+'" >Edit </a> </td><tr>';


          });


          $("#student_tbody").html(htm);
          },
          error: function(resultData) {
          alert("Failed");
          },
      });

});
 function hello(id){
 alert(id);
 }


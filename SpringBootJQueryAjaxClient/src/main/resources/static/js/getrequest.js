$( document ).ready(function() {
	
	// GET REQUEST
	$("#getAllCustomerId").click(function(event){
		event.preventDefault();
		ajaxGet();
	});
	
	$(function initialize(){

		  ($("#example")).init();
		  var data="INDIA";
		  onChangeCallback(data);

		});
	
	function onChangeCallback(ctr){
		  console.log("The country was changed: " + ctr);
		  alert(ctr);
		  $(".test").append("tested");
		  $(".test").css("color", "red");
		}
	
	// DO GET
	function ajaxGet(){
		$.ajax({
			type : "GET",
			url : window.location + "api/car/all",
			success: function(result){
				if(result.status == "Done"){
					$('#getResultDiv ul').empty();
					var car = "";
					$.each(result.data, function(index, car){
						//var car = "- Car with Id = " + i + ", CarName = " + car.carName + "CarAccessoryName = " + car.carAccessory[0].accessoryName + "<br>";
						var caption = "<thead>"+ this.carName+ "</thead>";
						$('#getResultDiv table').append(caption);
						$.each(car.carAccessory, function(){
							console.log("Success: ", this.accessoryName);
							var markup = "<tr><td><input type='checkbox' name='record'></td><td>" + this.accessoryName + "</td><td>" + this.price+ "</td></tr>";
				            $("#getResultDiv table tbody").append(markup);
//							$('#getResultDiv .list-group').append(this.accessoryName);
//							$('#getResultDiv .list-group').append('<br>')
						});
			        });
					
				}else{
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})
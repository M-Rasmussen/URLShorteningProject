$(document).ready(function(){
	$("button").click(function(){
	$.ajax({
		type:'POST',
		url:'http://localhost:8080/shortenurl',
		data:JSON.stringify({
			"full_url":$("#urlinput").val(),
			"short_url":"abc"
	
	}),
	 contentType:"application/json;charset=utf-8",
	success:function(data){
		$("#shorturltext").val(data.short_url);
	}
	});
	});
});

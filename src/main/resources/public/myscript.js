function getJson(meta) {
	return meta.json();
}


function getTxtFromJsonUndPackInsHTMLMain(myjson) {
//	var tabelle = document.getElementById("tid001");
	var t_header = document.getElementById("thid001");
    var t_body = document.getElementById("tbid001");
	var i = 0;
	for (var laufvariable of myjson.trains_sceduler) {
    		// new element in the table
    		t_body.insertAdjacentHTML("beforeend",
    		"<tr>"
    			+ `<td> ${++i}</td>`
    			+ "<td>" + laufvariable.id + "</td>"
    			+ "<td>" + laufvariable.version + "</td>"
    		//	+ "<td>" + laufvariable.id + "</td>"
    		    + "<td>" + laufvariable.time + "</td>"
    		    + "<td>" + laufvariable.type + "</td>"
    			+ "<td>" + laufvariable.firm + "</td>"
    			+ "<td>" + laufvariable.information + "</td>"
    			+ "<td>" + laufvariable.platform +"</td>"
    			+ "<td>" + laufvariable.internalID + "</td>"
    		+ "</tr>")
}
}





function addTrainMain(event) {   // bei event-click
	event.preventDefault();      // verhindert dass das event von Browser verwendet wird (verhindert GET-Request)
	console.log("click");
	var id = document.getElementById("idMain01").value;
    var version = document.getElementById("versionM").value;
	var time = document.getElementById("timeM").value;
	var type = document.getElementById("typeM").value;
	var firm = document.getElementById("firmM").value;
	var information = document.getElementById("infoM").value;
	var platform = document.getElementById("platformM").value;
	var internalID = document.getElementById("internalID").value;

	var jsonDataString = `{"id":"${id}","version":"${version}","time":"${time}","type":"${type}","firm":"${firm}","information":"${information}","platform":"${platform}","internalID":"${internalID}"}`;
	console.log(jsonDataString);

	fetch("http://localhost:8080/json/trains", {
		method: 'POST',
		body: jsonDataString,
		headers: {
			'Content-Type': 'application/json'
        }
	});
	refreshClick();
}

function updateTrainMain (event){
event.preventDefault();
   var id = document.getElementById("idMain01").value;
       var version = document.getElementById("versionM").value;
   	var time = document.getElementById("timeM").value;
   	var type = document.getElementById("typeM").value;
   	var firm = document.getElementById("firmM").value;
   	var information = document.getElementById("infoM").value;
   	var platform = document.getElementById("platformM").value;
   	var internalID = document.getElementById("internalID").value;

	var jsonDataString = `{"id":"${id}","version":"${version}","time":"${time}","type":"${type}","firm":"${firm}","information":"${information}","platform":"${platform}","internalID":"${internalID}"}`;
    	console.log(jsonDataString);
    fetch(`http://localhost:8080/json/trains`, {
    		method: 'PUT' ,
    		body: jsonDataString,
    		headers: {
    			'Content-Type': 'application/json'
    			}
    		});
refreshClick();
	}

//POST
var input = document.getElementById("button");
input.addEventListener("click",addTrainMain);

//UPDATE
var input = document.getElementById("buttonupdate");
input.addEventListener("click",updateTrainMain);
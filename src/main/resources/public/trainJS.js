function getJson(meta) {
	return meta.json();
}



function getTxtFromJsonUndPackInsHTML(myjson) {
//	var tabelle = document.getElementById("tid001");
	var t_header = document.getElementById("thid001odeg");
    var t_body = document.getElementById("tbid001odeg");
	var i = 0;
	var internalID=5000000;
	for (var laufvariable of myjson.trains_sceduler_ODEG) {
    		// new element in the table
    		t_body.insertAdjacentHTML("beforeend",
    		"<tr>"
    			+ `<td> ${++i}</td>`
    			+ "<td>" + laufvariable.id + "</td>"
    			+ "<td>" + laufvariable.version + "</td>"
    		//	+ "<td>" + laufvariable.id + "</td>"
    			+ "<td>" + laufvariable.time + "</td>"
    			+ "<td>" + laufvariable.direction + "</td>"
    			+ "<td>" + laufvariable.delay +"</td>"
    		//	+ "<td>" + laufvariable.internalID + "</td>"
    		+ "</tr>")
}
}



function addTrainODEG(event) {   // bei event-click
	event.preventDefault();      // verhindert dass das event von Browser verwendet wird (verhindert GET-Request)
	console.log("click");
	var id = document.getElementById("idODEG01").value;
    var version = document.getElementById("versionODEG").value;
	var time = document.getElementById("timeODEG").value;
	var direction = document.getElementById("directionODEG").value;
	var delay = document.getElementById("delayODEG").value;
	var internalID = document.getElementById("internalIDODEG").value;

	var jsonDataString = `{"id":"${id}","version":"${version}","time":"${time}","direction":"${direction}","delay":"${delay}","internalID":"${internalID}"}`;
	console.log(jsonDataString);

	fetch("http://localhost:8080/json/train", {
		method: 'POST',
		body: jsonDataString,
		headers: {
			'Content-Type': 'application/json'
        }
	});
	refreshClick();
}

//POST
var input = document.getElementById("buttonsubmit");
input.addEventListener("click",addTrainODEG);

function refreshTrains(){
fetch("http://localhost:8080/json/trains/all")
	.then(getJson)
	.then(getTxtFromJsonUndPackInsHTML)
}

refreshTrains();

function refreshClick() {
	document.getElementById("tbid001odeg").innerHTML="";
	refreshTrains();
}
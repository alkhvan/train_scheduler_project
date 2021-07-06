function getJson(meta) {
	return meta.json();
}

function getTxtFromJsonUndPackInsHTMLDB(myjson) {
//	var tabelle = document.getElementById("tid001");
	var t_header = document.getElementById("thid001db");
    var t_body = document.getElementById("tbid001db");
	var i = 0;
	var internalID=1000000;
	for (var laufvariable of myjson.trains_sceduler_DB) {
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
    			+ "<td>" + laufvariable.internalID + "</td>"
    		+ "</tr>")
}
}

function getTxtFromJsonUndPackInsHTMLODEG(myjson) {
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
    			+ "<td>" + laufvariable.internalID + "</td>"
    		+ "</tr>")
}
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

function addTrainDB(event) {   // bei event-click
	event.preventDefault();      // verhindert dass das event von Browser verwendet wird (verhindert GET-Request)
	console.log("click");
	var id = document.getElementById("idDB01").value;
    var version = document.getElementById("versionDB").value;
	var time = document.getElementById("timeDB").value;
	var direction = document.getElementById("directionDB").value;
	var delay = document.getElementById("delayDB").value;
	var internalID = document.getElementById("internalIDDB").value;

	var jsonDataString = `{"id":"${id}","version":"${version}","time":"${time}","direction":"${direction}","delay":"${delay}","internalID":"${internalID}"}`;
	console.log(jsonDataString);

	fetch("http://localhost:8080/json/person", {
		method: 'POST',
		body: jsonDataString,
		headers: {
			'Content-Type': 'application/json'
        }
	});
	refreshClick();
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

	fetch("http://localhost:8080/json/person", {
		method: 'POST',
		body: jsonDataString,
		headers: {
			'Content-Type': 'application/json'
        }
	});
	refreshClick();
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

	fetch("http://localhost:8080/json/person", {
		method: 'POST',
		body: jsonDataString,
		headers: {
			'Content-Type': 'application/json'
        }
	});
	refreshClick();
}
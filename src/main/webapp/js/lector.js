/*
// FETCH
window.onload=getRandomLectorFetch

function getRandomLectorFetch () {
	fetch("Controller?command=Random")
		.then(response => response.json())
		.then(lector => showRandomLector(lector))
		.then(() => setTimeout(getRandomLectorFetch, 5000))
}
*/

// AXIOS FOR THE BROWSER
window.onload = getRandomLectorAxios

function getRandomLectorAxios() {
	axios.get('/Controller?command=Random')
		.then(response => showRandomLector(response.data))
		.then(() => setTimeout(getRandomLectorAxios,5000))
}

function showRandomLector (lector) {
	let lectorDiv = document.getElementById("lector")
	let lectorParagraph = lectorDiv.childNodes[0]
	let lectorText = document.createTextNode(lector.name + " " + lector.firstname) // kan ook lector["name"]

	if (lectorParagraph == null) {
		lectorParagraph = document.createElement('p')
		lectorParagraph.appendChild(lectorText)
		lectorDiv.appendChild(lectorParagraph)
	} else {
		lectorParagraph.removeChild(lectorParagraph.childNodes[0])
		lectorParagraph.appendChild(lectorText)
	}
}
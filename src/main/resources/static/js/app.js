const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function(){
	if (xhr.readyState === 4 && xhr.status === 200){

		console.warn(xhr.responseText)
		// const revies = JSON.pars(xhr.response)
		// reviewsOverviewSetup(reviews);
	}
}

xhr.open('GET', 'http://localhost:8080/reviews', true)
xhr.send()

function reviewsOverviewSetup (reviews){
	
}


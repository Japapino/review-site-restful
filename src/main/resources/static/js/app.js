const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function(){
	if (xhr.readyState === 4 && xhr.status === 200){
		const reviews = JSON.parse(xhr.response)
		getReviews(reviews); 
	}
}
xhr.open('GET', 'http://localhost:8080/reviews', true)
xhr.send()

function getReviews(reviews){
	reviews.forEach(function(review){
		reviewSetup(review)
	})

	reviews.forEach(function(review){
		overviewSetup(review)
	})
	clickingOnMovieName()
}

function reviewSetup(res){
	const body = document.querySelector('.review_container')
	const reviewContainer = document.createElement('div')
	reviewContainer.classList.add('review')

	appendElement(reviewContainer, createElement('h1', res.title))
	appendElement(reviewContainer, createElement('h2', res.description))
	appendElement(body, reviewContainer)

}

function overviewSetup(res){
	const body = document.querySelector('.overview_container')
	const overviewContainer = document.createElement('div')
	overviewContainer.classList.add('overview')

	appendElement(overviewContainer, createElement('p', res.coverURL))
	appendElement(overviewContainer, createElement('div', res.description))
	appendElement(body, overviewContainer)

}

function createElement(elem, textValue){
	const newElem = document.createElement(elem)
	newElem.innerText = textValue

	return newElem
}
function appendElement(parent, child){
	parent.appendChild(child)
}



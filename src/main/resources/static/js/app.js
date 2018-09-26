const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function(){
	if (xhr.readyState === 4 && xhr.status === 200){
		console.warn('Hello')

		const reviews = JSON.parse(xhr.response)
		reviewOverviewSetup(reviews); 
	}
}
xhr.open('GET', 'http://localhost:8080/reviews/1', true)
xhr.send()

function reviewOverviewSetup(res){
	const body = document.querySelector('.review_container')
	const reviewContainer = document.createElement('div')
	reviewContainer.classList.add('review_container')

	appendElement(reviewContainer, createElement('h2', res.title))
	appendElement(reviewContainer, createElement('h2', res.description))

	appendElement(body, reviewContainer)

}
// function reviewOverviewSetup(){
// 	funds.forEach(function(review){
// 		appendOneElementToBody(review)
// 	})
// }

// function appendOneElementToBody(res){
// 	const body = document.quereySelector('.review_container')
// 	const reviewContainer = document.createElement('div')
// 	reviewContainer.classList.add('review_container')

// 	let review = createElement('button', res.reviewName)
// 	review.className = 'reviewInformaion'

// 	appendElement(reviewContainer, createElement('h2', res.reviewTitle))
// 	appendElement(reviewContainer, createElement('h2', res.reviewDescription))

// 	appendElement(body, reviewContainer)
// }

function createElement(elem, textValue){
	const newElem = document.createElement(elem)
	newElem.innerText = textValue

	return newElem
}
function appendElement(parent, child){
	parent.appendChild(child)
}


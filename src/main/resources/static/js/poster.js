const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function(){
	if (xhr.readyState === 4 && xhr.status === 200){
		console.warn('Hello')

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
}

function posterSetup(res){
	const body = document.querySelector('.movie_poster')
	var poster = document.querySelector('.poster')
	if (poster){
		body.removeChild('.poster')
	}
	
	const posterContainer = document.createElement('div')
	posterContainer.classList.add('poster')

	appendElement(posterContainer, addImage('img', res.coverURL))
	appendElement(body, posterContainer)
}

function createElement(elem, textValue){
	const newElem = document.createElement(elem)
	newElem.innerText = textValue

	return newElem
}
function appendElement(parent, child){
	parent.appendChild(child)
}

function addImage(cover){
	const newImage = document.createElement(img)
	newImage.setAttribute('src', cover)
	return newImage
}
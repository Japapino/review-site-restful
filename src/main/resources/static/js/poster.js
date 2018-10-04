const movieButton = document.querySelector('.review_container button')
movieButton = addEventListener('click', posterSetup)

function posterSetup(res){
	const body = document.querySelector('.movie_poster')
	var poster = document.querySelector('.poster')
	if (poster){
		body.removeChild('.poster')
	}

	//retrieve movie poster
	var xhrPosterRequest = new XMLHttpRequest()
	xhrPosterRequest.onreadystatechange = function(){
    	if (xhrPosterRequest.readyState === 4 && xhrPosterRequest.status === 200){
    		var res = JSON.parse(xhrPosterRequest)
    	}
	}

	xhrPosterRequest.open('GET', '/reviews/1' , true)
    xhrPosterRequest.send()

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


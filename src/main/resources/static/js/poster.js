function clickingOnMovieName() {
	console.warn('test1')
	const movieName = document.querySelectorAll('.review')
	if (movieName) movieName.forEach(button => {
		console.warn('test2')
		const movieId = button.parentElement.getAttribute('id');
		button.addEventListener('click', () => {
			showPoster(movieId); 
		})
	})
}

function showPoster (id){
	const body = document.querySelector('.movie_poster')
	var poster = document.querySelector('.poster')
	if (poster){
		body.removeChild('.poster')
	}

	//retrieve movie poster

	const posterContainer = document.createElement('div')
	posterContainer.classList.add('poster')

	appendElement(posterContainer, addImage('img', id.coverURL))
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


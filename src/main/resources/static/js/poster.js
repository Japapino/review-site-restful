


function clickingOnMovieName() {
	const movieName = document.querySelectorAll('.review')
	if (movieName) movieName.forEach(button => {
		const movieId = button.parentElement.getAttribute('data-review-id');
		const movieCover = button.parentElement.getAttribute('data-review-cover')
		button.addEventListener('click', () => {
			showPoster(movieId, movieCover); 
		})
	})
}

function showPoster (id, cover){
	console.warn('poster test')
	const body = document.querySelector('.movie_poster')
	// var poster = document.querySelector('.poster')
	// if (poster){
	// 	body.removeChild('.poster')
	// }

	//retrieve movie poster

	const posterContainer = document.createElement('div')
	posterContainer.classList.add('poster')

	appendElement(posterContainer, addImage('img', cover))
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
	const newImage = document.createElement('img')
	newImage.setAttribute('src', cover)
	return newImage
}


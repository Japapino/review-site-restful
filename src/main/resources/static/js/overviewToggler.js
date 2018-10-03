const toggler = document.querySelector('overviewToggler');
const item = document.querySelector('.review_container'); 

toggler.addEventListener('click'() =>{
	toggler.classList.toggle('active');
	item.classList.toggle('active'); 
})
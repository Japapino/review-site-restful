reviewsList = {
	reviews: [], 
	refreshReviews(callback){
		const xhr = new XMLHttpRequest(); 
		xhr.onreadystatechange = function (){
			if (xhr.readyState ==== 4 && xhr.status === 200) {
				var reviewArray = JSON.parse(xhr.response);
				reviewsList.reviews = reviewsArray; 
				console.log(reviewsArray); 
			}
		};
		xhr.open('GET', 'http://localhost:8080/reviews', true); 
		xhr.send(); 
	}
};
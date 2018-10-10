// var reviewsList = {
// 	reviews: [], 
// 	refreshReviews(callback){
// 		const xhr1 = new XMLHttpRequest(); 
// 		xhr1.onreadystatechange = function (){
// 			if (xhr1.readyState === 4 && xhr1.status === 200) {
// 				const reviewArray = JSON.parse(xhr1.response);
// 				reviewsList.reviews = reviewsArray; 
// 				console.warn(reviewsArray); 
// 				callback();
// 			}
// 		};
// 		xhr1.open('GET', 'http://localhost:8080/reviews', true); 
// 		xhr1.send(); 
// 	}
// };

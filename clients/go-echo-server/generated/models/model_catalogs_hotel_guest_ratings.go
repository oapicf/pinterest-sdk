package models

type CatalogsHotelGuestRatings struct {

	// Max value for the hotel rating score.
	MaxScore *float32 `json:"max_score,omitempty"`

	// Total number of people who have rated this hotel.
	NumberOfReviewers *int32 `json:"number_of_reviewers,omitempty"`

	// System you use for guest reviews.
	RatingSystem *string `json:"rating_system,omitempty"`

	// Your hotel's rating.
	Score *float32 `json:"score,omitempty"`
}

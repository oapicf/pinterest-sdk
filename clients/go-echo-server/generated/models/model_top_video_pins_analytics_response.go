package models

type TopVideoPinsAnalyticsResponse struct {

	DateAvailability TopPinsAnalyticsResponseDateAvailability `json:"date_availability,omitempty"`

	Pins []TopVideoPinsAnalyticsResponsePinsInner `json:"pins,omitempty"`

	SortBy string `json:"sort_by,omitempty"`
}

package models

type TopPinsAnalyticsResponse struct {

	DateAvailability TopPinsAnalyticsResponseDateAvailability `json:"date_availability,omitempty"`

	Pins []TopPinsAnalyticsResponsePinsInner `json:"pins,omitempty"`

	SortBy string `json:"sort_by,omitempty"`
}

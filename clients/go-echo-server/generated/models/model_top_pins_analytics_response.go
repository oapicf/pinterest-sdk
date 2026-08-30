package models

type TopPinsAnalyticsResponse struct {

	DateAvailability TopPinsAnalyticsResponseDateAvailability `json:"date_availability,omitempty"`

	Pins []TopPinsAnalyticsResponsePinsItems `json:"pins,omitempty"`

	SortBy TopPinsSortBy `json:"sort_by,omitempty"`
}

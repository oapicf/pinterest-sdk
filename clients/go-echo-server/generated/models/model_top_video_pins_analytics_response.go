package models

type TopVideoPinsAnalyticsResponse struct {

	DateAvailability TopVideoPinsAnalyticsResponseDateAvailability `json:"date_availability,omitempty"`

	Pins []TopVideoPinsAnalyticsResponsePinsItems `json:"pins,omitempty"`

	SortBy TopVideoPinsSortBy `json:"sort_by,omitempty"`
}

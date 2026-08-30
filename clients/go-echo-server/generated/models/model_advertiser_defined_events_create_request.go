package models

// AdvertiserDefinedEventsCreateRequest - Request body for creating or updating advertiser defined events
type AdvertiserDefinedEventsCreateRequest struct {

	// List of advertiser defined events to create or update
	Items []AdvertiserDefinedEventInput `json:"items"`
}

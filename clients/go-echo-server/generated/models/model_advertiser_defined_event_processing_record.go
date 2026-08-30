package models

// AdvertiserDefinedEventProcessingRecord - Processing record for an advertiser defined event operation
type AdvertiserDefinedEventProcessingRecord struct {

	// List of exception messages if the operation failed
	Exceptions []string `json:"exceptions,omitempty"`

	// Name of the advertiser defined event
	Name string `json:"name"`

	// Processing status (success or failure)
	Status string `json:"status"`
}

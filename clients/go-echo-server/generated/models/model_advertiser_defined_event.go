package models

type AdvertiserDefinedEvent struct {

	// raw string name of the event, usually logged as raw_event_name in our dataset
	Name string `json:"name,omitempty"`

	// standard type mapped to ADE for optimization
	MappedConversionType *string `json:"mapped_conversion_type,omitempty"`
}

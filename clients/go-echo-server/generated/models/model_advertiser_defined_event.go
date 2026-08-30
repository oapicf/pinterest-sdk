package models

// AdvertiserDefinedEvent - Advertiser defined event
type AdvertiserDefinedEvent struct {

	// Standard type mapped to ADE for optimization
	MappedConversionType ConversionTagTypeOptimal `json:"mapped_conversion_type,omitempty"`

	// Raw string name of the event, usually logged as raw_event_name in our dataset
	Name string `json:"name,omitempty"`
}

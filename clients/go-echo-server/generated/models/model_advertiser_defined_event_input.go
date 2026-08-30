package models

// AdvertiserDefinedEventInput - Advertiser defined event input for create/update operations
type AdvertiserDefinedEventInput struct {

	// Pinterest standard event type to map this custom event to for campaign optimization and reporting
	MappedConversionType AdvertiserDefinedEventMappingType `json:"mapped_conversion_type"`

	// Raw string name of the event
	Name string `json:"name"`
}

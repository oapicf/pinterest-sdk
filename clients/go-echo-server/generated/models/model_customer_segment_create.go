package models

// CustomerSegmentCreate - Resource create operation model.
type CustomerSegmentCreate struct {

	// Audience IDs included in the customer segment.
	AudienceIds []string `json:"audience_ids"`

	// Customer segment name.
	Name string `json:"name"`
}

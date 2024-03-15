package models

type AudienceSubcategory struct {

	// Interest unique key (same as ID).
	Key string `json:"key,omitempty"`

	// Subinterest name.
	Name string `json:"name,omitempty"`

	// Subinterest's percent of category's total audience.
	Ratio float32 `json:"ratio,omitempty"`

	// Subinterest affinity index.
	Index float32 `json:"index,omitempty"`

	// Subinterest ID.
	Id string `json:"id,omitempty"`
}

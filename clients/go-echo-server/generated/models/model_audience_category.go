package models

type AudienceCategory struct {

	// Interest unique key (same as ID).
	Key string `json:"key,omitempty"`

	// Interest name.
	Name string `json:"name,omitempty"`

	// Interest's percent of category's total audience.
	Ratio float32 `json:"ratio,omitempty"`

	// Interest affinity index.
	Index float32 `json:"index,omitempty"`

	// Interest ID.
	Id string `json:"id,omitempty"`

	// Subcategory interest distribution
	Subcategories []AudienceSubcategory `json:"subcategories,omitempty"`
}

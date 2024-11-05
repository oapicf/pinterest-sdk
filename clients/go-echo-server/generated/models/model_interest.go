package models

type Interest struct {

	CanonicalUrl string `json:"canonical_url,omitempty"`

	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	Key string `json:"key,omitempty"`

	Name string `json:"name,omitempty"`
}

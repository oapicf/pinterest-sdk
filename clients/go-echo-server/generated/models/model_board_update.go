package models

// BoardUpdate - Board fields for updates
type BoardUpdate struct {

	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Privacy string `json:"privacy,omitempty"`
}

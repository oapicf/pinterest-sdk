package models

type Paginated struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []map[string]interface{} `json:"items"`
}

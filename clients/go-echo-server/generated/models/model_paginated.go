package models

type Paginated struct {

	Items []map[string]interface{} `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

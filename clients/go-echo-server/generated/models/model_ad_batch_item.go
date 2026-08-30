package models

type AdBatchItem struct {

	Data Ad `json:"data,omitempty"`

	Exceptions PinterestLibError `json:"exceptions,omitempty"`
}

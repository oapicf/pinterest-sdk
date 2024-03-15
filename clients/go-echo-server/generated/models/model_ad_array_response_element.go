package models

type AdArrayResponseElement struct {

	Data AdResponse `json:"data,omitempty"`

	Exceptions Exception `json:"exceptions,omitempty"`
}

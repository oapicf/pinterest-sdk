package models

type AdGroupArrayResponseElement struct {

	Data AdGroupResponse `json:"data,omitempty"`

	Exceptions []Exception `json:"exceptions,omitempty"`
}

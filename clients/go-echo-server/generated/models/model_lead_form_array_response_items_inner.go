package models

type LeadFormArrayResponseItemsInner struct {

	Data LeadFormResponse `json:"data,omitempty"`

	Exceptions []Exception `json:"exceptions,omitempty"`
}

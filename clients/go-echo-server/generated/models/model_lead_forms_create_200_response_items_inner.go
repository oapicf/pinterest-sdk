package models

type LeadFormsCreate200ResponseItemsInner struct {

	Data LeadForm `json:"data,omitempty"`

	Exceptions []PinterestLibBatchItemException `json:"exceptions,omitempty"`
}

package models

// PinterestLibBatchItemException - Exception details for a batch operation item.
type PinterestLibBatchItemException struct {

	Code int32 `json:"code,omitempty"`

	Message string `json:"message"`
}

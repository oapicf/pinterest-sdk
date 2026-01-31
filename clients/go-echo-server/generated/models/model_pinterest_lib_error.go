package models

// PinterestLibError - Default error response
type PinterestLibError struct {

	Code int32 `json:"code"`

	Message string `json:"message"`
}

package models

type Exception struct {

	Code int32 `json:"code,omitempty"`

	Message string `json:"message"`
}

package models

type SsioOrderLinesGetByAdAccount200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []SsioOrderLine `json:"items"`
}

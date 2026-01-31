package models

type SsioOrderLinesGetByAdAccount200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// SSIO order lines by ad acount id
	Items []SsioOrderLine `json:"items"`
}

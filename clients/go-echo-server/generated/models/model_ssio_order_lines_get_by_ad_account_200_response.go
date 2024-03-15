package models

type SsioOrderLinesGetByAdAccount200Response struct {

	// SSIO order lines by ad acount id
	Items []SsioOrderLine `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

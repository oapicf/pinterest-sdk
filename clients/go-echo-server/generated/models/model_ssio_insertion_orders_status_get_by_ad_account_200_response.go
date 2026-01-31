package models

type SsioInsertionOrdersStatusGetByAdAccount200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// Insertion orders status by ad acount id
	Items []SsioInsertionOrderStatus `json:"items"`
}

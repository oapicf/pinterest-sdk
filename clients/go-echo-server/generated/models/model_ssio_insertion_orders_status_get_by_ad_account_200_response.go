package models

type SsioInsertionOrdersStatusGetByAdAccount200Response struct {

	// Insertion orders status by ad acount id
	Items []SsioInsertionOrderStatus `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

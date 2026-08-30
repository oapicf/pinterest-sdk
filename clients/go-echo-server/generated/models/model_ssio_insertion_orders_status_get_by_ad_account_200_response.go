package models

type SsioInsertionOrdersStatusGetByAdAccount200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []SsioInsertionOrderStatus `json:"items"`
}

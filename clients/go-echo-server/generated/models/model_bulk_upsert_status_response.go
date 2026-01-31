package models

// BulkUpsertStatusResponse - ID of the bulk request.
type BulkUpsertStatusResponse struct {

	ResultUrl string `json:"result_url,omitempty"`

	Status BulkUpsertStatus `json:"status,omitempty"`
}

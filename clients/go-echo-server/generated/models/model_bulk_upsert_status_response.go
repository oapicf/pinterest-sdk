package models

// BulkUpsertStatusResponse - ID of the bulk request.
type BulkUpsertStatusResponse struct {

	Status BulkUpsertStatus `json:"status,omitempty"`

	ResultUrl string `json:"result_url,omitempty"`
}

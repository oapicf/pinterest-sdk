package models

type LabelBulkUpdateRequest struct {

	// Label ID.
	Id string `json:"id"`

	// Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	ParentId string `json:"parent_id"`

	Status LabelStatusBulkUpdate `json:"status"`
}

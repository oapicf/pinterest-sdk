package models

// BulkUpsertRequest - Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
type BulkUpsertRequest struct {

	Create BulkUpsertRequestCreate `json:"create,omitempty"`

	Update BulkUpsertRequestUpdate `json:"update,omitempty"`
}

package models

// CustomerListUpdateWithRequiredBody - Resource create or update operation model with required body fields (no OptionalProperties).
type CustomerListUpdateWithRequiredBody struct {

	// Customer list update operation type (add or remove). Only valid in update request body.
	OperationType UserListOperationType `json:"operation_type"`

	// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	Records string `json:"records,omitempty"`

	// Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
	RecordsV2 []CustomerListRecordRow `json:"records_v2,omitempty"`
}

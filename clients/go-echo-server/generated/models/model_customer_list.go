package models

type CustomerList struct {

	// Associated ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty"`

	// Creation time. Unix timestamp in seconds.
	CreatedTime float32 `json:"created_time,omitempty"`

	// Customer list errors.
	Exceptions map[string]interface{} `json:"exceptions,omitempty"`

	// Customer list ID.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
	IsNca bool `json:"is_nca,omitempty"`

	// Customer list name.
	Name string `json:"name"`

	// Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
	NumBatches float32 `json:"num_batches,omitempty"`

	// Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
	NumRemovedUserRecords float32 `json:"num_removed_user_records,omitempty"`

	// Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
	NumUploadedUserRecords float32 `json:"num_uploaded_user_records,omitempty"`

	// Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
	Status CustomerListStatus `json:"status,omitempty"`

	// Always `customerlist`.
	Type string `json:"type,omitempty"`

	// Last update time. Unix timestamp in seconds.
	UpdatedTime float32 `json:"updated_time,omitempty"`
}

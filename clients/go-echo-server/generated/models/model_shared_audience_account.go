package models

type SharedAudienceAccount struct {

	// Account ID (ad account or business ID).
	AccountId string `json:"account_id" validate:"regexp=^\\\\d+$"`

	// Account name.
	AccountName string `json:"account_name"`

	// account type
	AccountType string `json:"account_type"`

	// Epoch timestamp in seconds for the shared audience event
	SharedOnTimestamp int32 `json:"shared_on_timestamp"`
}

package models

// CampaignAdPreviewCreate - Resource create operation model.
type CampaignAdPreviewCreate struct {

	// Ad group ID to create a preview record for.
	AdGroupId string `json:"ad_group_id" validate:"regexp=^\\d+$"`
}

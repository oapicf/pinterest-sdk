package models

type BulkDownloadRequestCampaignFilter struct {

	CampaignStatus []CampaignSummaryStatus `json:"campaign_status,omitempty"`

	// Unix UTC timestamp.
	EndTime string `json:"end_time,omitempty" validate:"regexp=^\\\\d+$"`

	// Campaign name
	Name string `json:"name,omitempty"`

	ObjectiveType []ObjectiveType `json:"objective_type,omitempty"`

	// Unix UTC timestamp.
	StartTime string `json:"start_time,omitempty" validate:"regexp=^\\\\d+$"`
}

package models

type BulkDownloadRequestCampaignFilter struct {

	// Unix UTC timestamp.
	StartTime string `json:"start_time,omitempty"`

	// Unix UTC timestamp.
	EndTime string `json:"end_time,omitempty"`

	// Campaign name
	Name string `json:"name,omitempty"`

	CampaignStatus []CampaignSummaryStatus `json:"campaign_status,omitempty"`

	ObjectiveType []ObjectiveType `json:"objective_type,omitempty"`
}

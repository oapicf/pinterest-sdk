package models
// CampaignSummaryStatus : Summary status for campaign
type CampaignSummaryStatus string

// List of CampaignSummaryStatus
const (
	RUNNING CampaignSummaryStatus = "RUNNING"
	PAUSED CampaignSummaryStatus = "PAUSED"
	NOT_STARTED CampaignSummaryStatus = "NOT_STARTED"
	COMPLETED CampaignSummaryStatus = "COMPLETED"
	ADVERTISER_DISABLED CampaignSummaryStatus = "ADVERTISER_DISABLED"
	ARCHIVED CampaignSummaryStatus = "ARCHIVED"
	DRAFT CampaignSummaryStatus = "DRAFT"
	DELETED_DRAFT CampaignSummaryStatus = "DELETED_DRAFT"
)

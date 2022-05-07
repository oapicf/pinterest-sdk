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
)

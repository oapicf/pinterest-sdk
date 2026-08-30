package models
// SummaryStatus : Summary status for campaign
type SummaryStatus string

// List of SummaryStatus
const (
	RUNNING SummaryStatus = "RUNNING"
	PAUSED SummaryStatus = "PAUSED"
	NOT_STARTED SummaryStatus = "NOT_STARTED"
	COMPLETED SummaryStatus = "COMPLETED"
	ADVERTISER_DISABLED SummaryStatus = "ADVERTISER_DISABLED"
	ARCHIVED SummaryStatus = "ARCHIVED"
	DRAFT SummaryStatus = "DRAFT"
	DELETED_DRAFT SummaryStatus = "DELETED_DRAFT"
)

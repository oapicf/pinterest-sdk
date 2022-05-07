package models
// ProductGroupSummaryStatus : Summary status for product group
type ProductGroupSummaryStatus string

// List of ProductGroupSummaryStatus
const (
	RUNNING ProductGroupSummaryStatus = "RUNNING"
	PAUSED ProductGroupSummaryStatus = "PAUSED"
	EXCLUDED ProductGroupSummaryStatus = "EXCLUDED"
	ARCHIVED ProductGroupSummaryStatus = "ARCHIVED"
)

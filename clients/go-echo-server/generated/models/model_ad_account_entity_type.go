package models
// AdAccountEntityType : Specify the entity type to get summary information
type AdAccountEntityType string

// List of AdAccountEntityType
const (
	ADVERTISER AdAccountEntityType = "ADVERTISER"
	CAMPAIGN AdAccountEntityType = "CAMPAIGN"
	AD_GROUP AdAccountEntityType = "AD_GROUP"
	AD AdAccountEntityType = "AD"
)

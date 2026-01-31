package models
// BulkEntityType : Refers ads entity type. Schedule enum is only applicable to beta users
type BulkEntityType string

// List of BulkEntityType
const (
	CAMPAIGN BulkEntityType = "CAMPAIGN"
	AD_GROUP BulkEntityType = "AD_GROUP"
	PRODUCT_GROUP BulkEntityType = "PRODUCT_GROUP"
	AD BulkEntityType = "AD"
	KEYWORD BulkEntityType = "KEYWORD"
	LABEL BulkEntityType = "LABEL"
	SCHEDULE BulkEntityType = "SCHEDULE"
)

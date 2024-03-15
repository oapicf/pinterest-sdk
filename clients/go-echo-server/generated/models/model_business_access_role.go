package models
// BusinessAccessRole : Permission role for business access.
type BusinessAccessRole string

// List of BusinessAccessRole
const (
	OWNER BusinessAccessRole = "OWNER"
	ADMIN BusinessAccessRole = "ADMIN"
	ANALYST BusinessAccessRole = "ANALYST"
	SOS_READER BusinessAccessRole = "SOS_READER"
	FINANCE_MANAGER BusinessAccessRole = "FINANCE_MANAGER"
	AUDIENCE_MANAGER BusinessAccessRole = "AUDIENCE_MANAGER"
	CAMPAIGN_MANAGER BusinessAccessRole = "CAMPAIGN_MANAGER"
	CATALOGS_MANAGER BusinessAccessRole = "CATALOGS_MANAGER"
	RESTRICTED_OWNER BusinessAccessRole = "RESTRICTED_OWNER"
	PROFILE_MANAGER BusinessAccessRole = "PROFILE_MANAGER"
	PROFILE_PUBLISHER BusinessAccessRole = "PROFILE_PUBLISHER"
	RESOURCE_PINNER_LIST_OWNER BusinessAccessRole = "RESOURCE_PINNER_LIST_OWNER"
	RESOURCE_PINNER_LIST_READER BusinessAccessRole = "RESOURCE_PINNER_LIST_READER"
	BIZ_PINNER_LIST_SHARER BusinessAccessRole = "BIZ_PINNER_LIST_SHARER"
	RESOURCE_CONVERSION_TAGS_READER BusinessAccessRole = "RESOURCE_CONVERSION_TAGS_READER"
)

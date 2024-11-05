package models

type Permissions string

// List of Permissions
const (
	ADMIN Permissions = "ADMIN"
	ANALYST Permissions = "ANALYST"
	FINANCE_MANAGER Permissions = "FINANCE_MANAGER"
	AUDIENCE_MANAGER Permissions = "AUDIENCE_MANAGER"
	CAMPAIGN_MANAGER Permissions = "CAMPAIGN_MANAGER"
	CATALOGS_MANAGER Permissions = "CATALOGS_MANAGER"
	PROFILE_PUBLISHER Permissions = "PROFILE_PUBLISHER"
)

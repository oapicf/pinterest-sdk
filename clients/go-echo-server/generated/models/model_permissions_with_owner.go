package models

type PermissionsWithOwner string

// List of PermissionsWithOwner
const (
	ADMIN PermissionsWithOwner = "ADMIN"
	ANALYST PermissionsWithOwner = "ANALYST"
	FINANCE_MANAGER PermissionsWithOwner = "FINANCE_MANAGER"
	AUDIENCE_MANAGER PermissionsWithOwner = "AUDIENCE_MANAGER"
	CAMPAIGN_MANAGER PermissionsWithOwner = "CAMPAIGN_MANAGER"
	CATALOGS_MANAGER PermissionsWithOwner = "CATALOGS_MANAGER"
	CATALOGS_VIEWER PermissionsWithOwner = "CATALOGS_VIEWER"
	PROFILE_PUBLISHER PermissionsWithOwner = "PROFILE_PUBLISHER"
	OWNER PermissionsWithOwner = "OWNER"
)

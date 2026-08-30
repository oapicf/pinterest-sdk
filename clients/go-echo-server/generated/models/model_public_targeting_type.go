package models
// PublicTargetingType : Public ad targeting type with external names
type PublicTargetingType string

// List of PublicTargetingType
const (
	APPTYPE PublicTargetingType = "APPTYPE"
	GENDER PublicTargetingType = "GENDER"
	LOCALE PublicTargetingType = "LOCALE"
	AGE_BUCKET PublicTargetingType = "AGE_BUCKET"
	LOCATION PublicTargetingType = "LOCATION"
	GEO PublicTargetingType = "GEO"
	INTEREST PublicTargetingType = "INTEREST"
	KEYWORD PublicTargetingType = "KEYWORD"
	AUDIENCE_INCLUDE PublicTargetingType = "AUDIENCE_INCLUDE"
	AUDIENCE_EXCLUDE PublicTargetingType = "AUDIENCE_EXCLUDE"
)

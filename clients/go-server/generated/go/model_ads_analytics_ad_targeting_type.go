// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi


import (
	"fmt"
)


// AdsAnalyticsAdTargetingType : Reporting targeting type for ads
type AdsAnalyticsAdTargetingType string

// List of AdsAnalyticsAdTargetingType
const (
	KEYWORD AdsAnalyticsAdTargetingType = "KEYWORD"
	APPTYPE AdsAnalyticsAdTargetingType = "APPTYPE"
	GENDER AdsAnalyticsAdTargetingType = "GENDER"
	LOCATION AdsAnalyticsAdTargetingType = "LOCATION"
	PLACEMENT AdsAnalyticsAdTargetingType = "PLACEMENT"
	COUNTRY AdsAnalyticsAdTargetingType = "COUNTRY"
	TARGETED_INTEREST AdsAnalyticsAdTargetingType = "TARGETED_INTEREST"
	PINNER_INTEREST AdsAnalyticsAdTargetingType = "PINNER_INTEREST"
	AUDIENCE_INCLUDE AdsAnalyticsAdTargetingType = "AUDIENCE_INCLUDE"
	GEO AdsAnalyticsAdTargetingType = "GEO"
	AGE_BUCKET AdsAnalyticsAdTargetingType = "AGE_BUCKET"
	REGION AdsAnalyticsAdTargetingType = "REGION"
	QUIZ_RESULT AdsAnalyticsAdTargetingType = "QUIZ_RESULT"
	AGE_BUCKET_AND_GENDER AdsAnalyticsAdTargetingType = "AGE_BUCKET_AND_GENDER"
)

// AllowedAdsAnalyticsAdTargetingTypeEnumValues is all the allowed values of AdsAnalyticsAdTargetingType enum
var AllowedAdsAnalyticsAdTargetingTypeEnumValues = []AdsAnalyticsAdTargetingType{
	"KEYWORD",
	"APPTYPE",
	"GENDER",
	"LOCATION",
	"PLACEMENT",
	"COUNTRY",
	"TARGETED_INTEREST",
	"PINNER_INTEREST",
	"AUDIENCE_INCLUDE",
	"GEO",
	"AGE_BUCKET",
	"REGION",
	"QUIZ_RESULT",
	"AGE_BUCKET_AND_GENDER",
}

// validAdsAnalyticsAdTargetingTypeEnumValue provides a map of AdsAnalyticsAdTargetingTypes for fast verification of use input
var validAdsAnalyticsAdTargetingTypeEnumValues = map[AdsAnalyticsAdTargetingType]struct{}{
	"KEYWORD": {},
	"APPTYPE": {},
	"GENDER": {},
	"LOCATION": {},
	"PLACEMENT": {},
	"COUNTRY": {},
	"TARGETED_INTEREST": {},
	"PINNER_INTEREST": {},
	"AUDIENCE_INCLUDE": {},
	"GEO": {},
	"AGE_BUCKET": {},
	"REGION": {},
	"QUIZ_RESULT": {},
	"AGE_BUCKET_AND_GENDER": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AdsAnalyticsAdTargetingType) IsValid() bool {
	_, ok := validAdsAnalyticsAdTargetingTypeEnumValues[v]
	return ok
}

// NewAdsAnalyticsAdTargetingTypeFromValue returns a pointer to a valid AdsAnalyticsAdTargetingType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAdsAnalyticsAdTargetingTypeFromValue(v string) (AdsAnalyticsAdTargetingType, error) {
	ev := AdsAnalyticsAdTargetingType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for AdsAnalyticsAdTargetingType: valid values are %v", v, AllowedAdsAnalyticsAdTargetingTypeEnumValues)
}



// AssertAdsAnalyticsAdTargetingTypeRequired checks if the required fields are not zero-ed
func AssertAdsAnalyticsAdTargetingTypeRequired(obj AdsAnalyticsAdTargetingType) error {
	return nil
}

// AssertAdsAnalyticsAdTargetingTypeConstraints checks if the values respects the defined constraints
func AssertAdsAnalyticsAdTargetingTypeConstraints(obj AdsAnalyticsAdTargetingType) error {
	return nil
}

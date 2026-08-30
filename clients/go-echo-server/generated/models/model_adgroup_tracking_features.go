package models

type AdgroupTrackingFeatures struct {

	// Tracking features. To clear this field, set to null.
	Enabled []AdgroupTrackingFeatureType `json:"enabled,omitempty"`
}

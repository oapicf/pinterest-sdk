package models

type AdsAnalytics struct {

	AD_ID string `json:"AD_ID" validate:"regexp=^\\d+$"`

	DATE string `json:"DATE,omitempty"`
}

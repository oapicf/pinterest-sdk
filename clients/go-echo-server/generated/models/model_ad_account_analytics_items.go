package models

type AdAccountAnalyticsItems struct {

	AD_ACCOUNT_ID string `json:"AD_ACCOUNT_ID" validate:"regexp=^\\d+$"`

	DATE string `json:"DATE,omitempty"`
}

package models

type ConversionEventResponse struct {

	ConversionEvent ConversionTagType `json:"conversion_event,omitempty"`

	// Id of the tag.
	ConversionTagId string `json:"conversion_tag_id,omitempty"`

	// Id of the ad account.
	AdAccountId string `json:"ad_account_id,omitempty"`

	// Creation date in epoch format.
	CreatedTime int32 `json:"created_time,omitempty"`
}
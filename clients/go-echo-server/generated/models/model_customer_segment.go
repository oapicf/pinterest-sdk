package models

type CustomerSegment struct {

	// The ID of the ad account that this customer segment belongs to.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\d+$"`

	// Audience IDs included in the customer segment.
	AudienceIds []string `json:"audience_ids"`

	// Customer segment created time. Unix timestamp in seconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	// Customer segment ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	// Customer segment name.
	Name string `json:"name"`

	// Indicates whether the customer segment is active or deleted.
	Status TargetingTemplateStatus `json:"status,omitempty"`

	// Customer segment updated time. Unix timestamp in seconds.
	UpdatedTime int32 `json:"updated_time,omitempty"`
}

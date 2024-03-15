package models

type AudienceCreateCustomRequest struct {

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty"`

	// Audience name.
	Name string `json:"name"`

	Rule AudienceRule `json:"rule"`

	SharingType AudienceSharingType `json:"sharing_type"`

	DataParty AudienceDataParty `json:"data_party"`

	Category string `json:"category,omitempty"`
}

package models

type CampaignResponseAllOf1 struct {

	ObjectiveType ObjectiveType `json:"objective_type,omitempty"`

	// Campaign creation time. Unix timestamp in seconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	// UTC timestamp. Last update time.
	UpdatedTime int32 `json:"updated_time,omitempty"`

	// Always \"campaign\".
	Type string `json:"type,omitempty"`
}

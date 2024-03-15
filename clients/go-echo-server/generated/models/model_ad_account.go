package models

type AdAccount struct {

	Id string `json:"id,omitempty"`

	Name string `json:"name,omitempty"`

	Owner AdAccountOwner `json:"owner,omitempty"`

	Country Country `json:"country,omitempty"`

	Currency Currency `json:"currency,omitempty"`

	Permissions []BusinessAccessRole `json:"permissions,omitempty"`

	// Creation time. Unix timestamp in seconds.
	CreatedTime *int32 `json:"created_time,omitempty"`

	// Last update time. Unix timestamp in seconds.
	UpdatedTime *int32 `json:"updated_time,omitempty"`
}

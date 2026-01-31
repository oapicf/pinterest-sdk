package models

type AdAccount struct {

	Country Country `json:"country,omitempty"`

	//  Creation time. Unix timestamp in seconds.
	CreatedTime *int32 `json:"created_time,omitempty"`

	Currency Currency `json:"currency,omitempty"`

	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	// Ad account name.
	Name string `json:"name,omitempty"`

	// Ad account owner
	Owner AdAccountOwner `json:"owner,omitempty"`

	Permissions []BusinessAccessRole `json:"permissions,omitempty"`

	UpdatedTime *int32 `json:"updated_time,omitempty"`
}

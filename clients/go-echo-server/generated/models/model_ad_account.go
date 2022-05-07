package models

type AdAccount struct {

	Id string `json:"id,omitempty"`

	Name string `json:"name,omitempty"`

	Owner AdAccountOwner `json:"owner,omitempty"`

	Country Country `json:"country,omitempty"`

	Currency Currency `json:"currency,omitempty"`
}

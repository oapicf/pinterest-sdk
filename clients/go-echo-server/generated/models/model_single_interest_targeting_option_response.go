package models

type SingleInterestTargetingOptionResponse struct {

	Id string `json:"id,omitempty" validate:"regexp=\\\\d+"`

	Name string `json:"name,omitempty"`

	ChildInterests []string `json:"child_interests,omitempty"`

	Level int32 `json:"level,omitempty"`
}

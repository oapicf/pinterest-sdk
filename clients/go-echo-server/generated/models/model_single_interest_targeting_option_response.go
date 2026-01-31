package models

type SingleInterestTargetingOptionResponse struct {

	ChildInterests []string `json:"child_interests,omitempty"`

	Id string `json:"id,omitempty" validate:"regexp=\\\\d+"`

	Level int32 `json:"level,omitempty"`

	Name string `json:"name,omitempty"`
}

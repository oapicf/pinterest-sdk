package models

type SingleInterestTargetingOption struct {

	ChildInterests []string `json:"child_interests"`

	Id string `json:"id" validate:"regexp=^\\d+$"`

	Level int32 `json:"level"`

	Name string `json:"name"`
}

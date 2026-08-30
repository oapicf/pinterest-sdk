package models

type LabelCreateItem struct {

	LabelType LabelType `json:"label_type"`

	// Label name. 100-character limit.
	Value string `json:"value"`
}

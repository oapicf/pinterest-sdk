package models

type LabelCreateRequestLabelsInner struct {

	LabelType *LabelType `json:"label_type"`

	// Label name. 100-character limit.
	Value string `json:"value"`
}

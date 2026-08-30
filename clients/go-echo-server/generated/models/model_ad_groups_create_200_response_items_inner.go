package models

type AdGroupsCreate200ResponseItemsInner struct {

	Data AdGroup `json:"data,omitempty"`

	Exceptions []PinterestLibBatchItemException `json:"exceptions,omitempty"`
}

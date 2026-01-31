package models

type PageVisitConversionTagsGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []ConversionEventResponse `json:"items"`
}

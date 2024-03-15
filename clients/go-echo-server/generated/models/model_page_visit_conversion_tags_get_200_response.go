package models

type PageVisitConversionTagsGet200Response struct {

	Items []ConversionEventResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

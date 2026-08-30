package models

type SchedulesList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Schedule `json:"items"`
}

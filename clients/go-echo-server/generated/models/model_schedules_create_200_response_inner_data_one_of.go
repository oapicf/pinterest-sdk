package models

type SchedulesCreate200ResponseInnerDataOneOf struct {

	Id string `json:"id" validate:"regexp=^\\d+$"`

	// Schedule ID.
	ScheduleId string `json:"schedule_id" validate:"regexp=^\\d+$"`

	Exceptions PinterestLibError `json:"exceptions"`
}

package models

// CatalogsFeedProcessingSchedule - Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
type CatalogsFeedProcessingSchedule struct {

	// A time in format HH:MM with leading 0 (zero)
	Time string `json:"time" validate:"regexp=^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$"`

	// The timezone considered for the processing schedule time.
	Timezone *string `json:"timezone"`
}

package models

// CatalogsFeedProcessingSchedule - Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
type CatalogsFeedProcessingSchedule struct {

	// A time in format HH:MM with leading 0 (zero)
	Time string `json:"time"`

	// The timezone considered for the processing schedule time.
	Timezone *string `json:"timezone"`
}

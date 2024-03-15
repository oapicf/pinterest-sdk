package models

type ConversionApiResponseEventsInner struct {

	// Whether the event was processed successfully.
	Status string `json:"status"`

	// Error message containing more information about why the event failed to be processed.
	ErrorMessage *string `json:"error_message,omitempty"`

	// Warning messages about any fields in the event which are not standard. These are not critical to event processing.
	WarningMessage *string `json:"warning_message,omitempty"`
}

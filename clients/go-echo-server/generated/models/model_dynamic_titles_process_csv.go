package models

type DynamicTitlesProcessCsv struct {

	// List of validation errors. Empty on success.
	Errors []DynamicTitlesProcessCsvError `json:"errors,omitempty"`

	// Processing status. Present on success.
	Status string `json:"status,omitempty"`
}

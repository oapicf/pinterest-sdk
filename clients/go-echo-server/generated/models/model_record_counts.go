package models

type RecordCounts struct {

	// Number of invalid records processed
	Invalid int32 `json:"invalid"`

	// Number of records processed
	Processed int32 `json:"processed"`

	// Number of valid records processed
	Valid int32 `json:"valid"`
}

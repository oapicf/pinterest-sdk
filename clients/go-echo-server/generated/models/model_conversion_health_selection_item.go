package models

// ConversionHealthSelectionItem - User selection of conversion health criteria for a single feature
type ConversionHealthSelectionItem struct {

	// Status for conversion types
	ConversionType map[string]interface{} `json:"conversionType,omitempty"`

	// Status for criteria
	Criteria map[string]interface{} `json:"criteria,omitempty"`

	// Status for ingestion sources
	IngestionSource map[string]interface{} `json:"ingestionSource,omitempty"`

	// Overall status for this selection item
	Status *interface{} `json:"status"`
}

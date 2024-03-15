package models
// CatalogsFormat : The file format of a feed.
type CatalogsFormat string

// List of CatalogsFormat
const (
	TSV CatalogsFormat = "TSV"
	CSV CatalogsFormat = "CSV"
	XML CatalogsFormat = "XML"
)

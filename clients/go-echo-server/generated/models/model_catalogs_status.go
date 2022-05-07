package models
// CatalogsStatus : Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
type CatalogsStatus string

// List of CatalogsStatus
const (
	ACTIVE CatalogsStatus = "ACTIVE"
	INACTIVE CatalogsStatus = "INACTIVE"
)

package models

type GetAudiencesOrderBy string

// List of GetAudiencesOrderBy
const (
	NONE GetAudiencesOrderBy = "NONE"
	ID GetAudiencesOrderBy = "ID"
	SIZE GetAudiencesOrderBy = "SIZE"
	CREATION_DATE GetAudiencesOrderBy = "CREATION_DATE"
	UPDATED_TIME GetAudiencesOrderBy = "UPDATED_TIME"
	NAME GetAudiencesOrderBy = "NAME"
	STATUS GetAudiencesOrderBy = "STATUS"
	TYPE GetAudiencesOrderBy = "TYPE"
)

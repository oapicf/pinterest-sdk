package models

type EntityLabelStatus string

// List of EntityLabelStatus
const (
	ACTIVE EntityLabelStatus = "ACTIVE"
	ARCHIVED EntityLabelStatus = "ARCHIVED"
	NULL EntityLabelStatus = "NULL"
)

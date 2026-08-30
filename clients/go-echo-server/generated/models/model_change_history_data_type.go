package models

type ChangeHistoryDataType string

// List of ChangeHistoryDataType
const (
	STRING ChangeHistoryDataType = "STRING"
	NUMERIC ChangeHistoryDataType = "NUMERIC"
	MICROCURRENCY ChangeHistoryDataType = "MICROCURRENCY"
	DATE ChangeHistoryDataType = "DATE"
	BOOL ChangeHistoryDataType = "BOOL"
	GENDER_LIST ChangeHistoryDataType = "GENDER_LIST"
	AGE_BUCKET_LIST ChangeHistoryDataType = "AGE_BUCKET_LIST"
	APPTYPE_LIST ChangeHistoryDataType = "APPTYPE_LIST"
	COUNTRY_LIST ChangeHistoryDataType = "COUNTRY_LIST"
	LOCALE_LIST ChangeHistoryDataType = "LOCALE_LIST"
)

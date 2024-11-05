package models
// LeadFormQuestionType : Lead form question type
type LeadFormQuestionType string

// List of LeadFormQuestionType
const (
	CUSTOM LeadFormQuestionType = "CUSTOM"
	FULL_NAME LeadFormQuestionType = "FULL_NAME"
	FIRST_NAME LeadFormQuestionType = "FIRST_NAME"
	LAST_NAME LeadFormQuestionType = "LAST_NAME"
	EMAIL LeadFormQuestionType = "EMAIL"
	PHONE_NUMBER LeadFormQuestionType = "PHONE_NUMBER"
	ZIP_CODE LeadFormQuestionType = "ZIP_CODE"
	GENDER LeadFormQuestionType = "GENDER"
	CITY LeadFormQuestionType = "CITY"
	COUNTRY LeadFormQuestionType = "COUNTRY"
	STATE_PROVINCE LeadFormQuestionType = "STATE_PROVINCE"
	ADDRESS LeadFormQuestionType = "ADDRESS"
	DATE_OF_BIRTH LeadFormQuestionType = "DATE_OF_BIRTH"
	AGE LeadFormQuestionType = "AGE"
)

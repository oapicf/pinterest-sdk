package models

type ConversionDeletionRequestTargets struct {

	// Array of plain text user emails.
	UserEmails []string `json:"user_emails"`

	// Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
	Epiks []string `json:"epiks"`
}

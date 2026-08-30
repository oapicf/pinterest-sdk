package models

type ConversionDeletionRequestEpikTargets struct {

	// Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
	Epiks []string `json:"epiks"`
}

package models

type CatalogsFeedValidationDetails struct {

	Errors CatalogsFeedValidationErrors `json:"errors"`

	Warnings CatalogsFeedValidationWarnings `json:"warnings"`
}

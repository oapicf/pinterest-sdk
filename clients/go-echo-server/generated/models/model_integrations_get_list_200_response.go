package models

type IntegrationsGetList200Response struct {

	Items []IntegrationRecord `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

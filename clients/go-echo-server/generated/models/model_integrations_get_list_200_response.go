package models

type IntegrationsGetList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []IntegrationRecord `json:"items"`
}

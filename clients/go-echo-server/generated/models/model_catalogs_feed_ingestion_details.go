package models

type CatalogsFeedIngestionDetails struct {

	Errors CatalogsFeedIngestionErrors `json:"errors"`

	Info CatalogsFeedIngestionInfo `json:"info"`
}

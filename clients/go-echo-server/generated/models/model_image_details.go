package models

type ImageDetails struct {

	Width int32 `json:"width"`

	Height *int32 `json:"height"`

	Url string `json:"url"`
}

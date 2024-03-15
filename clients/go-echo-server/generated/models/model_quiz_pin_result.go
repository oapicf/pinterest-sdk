package models

// QuizPinResult - The result, and link out, based on the user’s choice.
type QuizPinResult struct {

	OrganicPinId string `json:"organic_pin_id,omitempty"`

	AndroidDeepLink string `json:"android_deep_link,omitempty"`

	IosDeepLink string `json:"ios_deep_link,omitempty"`

	DestinationUrl string `json:"destination_url,omitempty"`

	ResultId float32 `json:"result_id,omitempty"`
}

package models

// MediaUploadAllOfUploadParameters - The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
type MediaUploadAllOfUploadParameters struct {

	XAmzDate string `json:"x-amz-date,omitempty"`

	XAmzSignature string `json:"x-amz-signature,omitempty"`

	XAmzSecurityToken string `json:"x-amz-security-token,omitempty"`

	XAmzAlgorithm string `json:"x-amz-algorithm,omitempty"`

	Key string `json:"key,omitempty"`

	Policy string `json:"policy,omitempty"`

	XAmzCredential string `json:"x-amz-credential,omitempty"`

	ContentType string `json:"Content-Type,omitempty"`
}
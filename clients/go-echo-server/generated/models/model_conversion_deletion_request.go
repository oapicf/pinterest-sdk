package models

// ConversionDeletionRequest - Conversion deletion request
type ConversionDeletionRequest struct {

	// Timestamp when the conversion deletion request was succesfully created.
	CreatedTime string `json:"created_time"`

	// Timestamp when the conversion deletion request was processed.
	ProcessedTime *string `json:"processed_time,omitempty"`

	// Unique identifier of the conversion deletion request
	RequestId string `json:"request_id" validate:"regexp=^\\d+$"`

	// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
	Status ConversionDeletionRequestStatus `json:"status"`
}

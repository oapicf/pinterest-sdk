package models

type CatalogsFeedIngestionErrors struct {

	// We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
	LINE_LEVEL_INTERNAL_ERROR int32 `json:"LINE_LEVEL_INTERNAL_ERROR,omitempty"`

	// The product count has decreased by more than 99% compared to the last successful ingestion.
	LARGE_PRODUCT_COUNT_DECREASE int32 `json:"LARGE_PRODUCT_COUNT_DECREASE,omitempty"`

	// We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
	ACCOUNT_FLAGGED int32 `json:"ACCOUNT_FLAGGED,omitempty"`

	// We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
	IMAGE_LEVEL_INTERNAL_ERROR int32 `json:"IMAGE_LEVEL_INTERNAL_ERROR,omitempty"`

	// Image files are unreadable. Please upload new files to continue.
	IMAGE_FILE_NOT_ACCESSIBLE int32 `json:"IMAGE_FILE_NOT_ACCESSIBLE,omitempty"`

	// Image files are unreadable. Please check your link and upload new files to continue.
	IMAGE_MALFORMED_URL int32 `json:"IMAGE_MALFORMED_URL,omitempty"`

	// Image files are unreadable. Please upload new files to continue.
	IMAGE_FILE_NOT_FOUND int32 `json:"IMAGE_FILE_NOT_FOUND,omitempty"`

	// Image files are unreadable. Please upload new files to continue.
	IMAGE_INVALID_FILE int32 `json:"IMAGE_INVALID_FILE,omitempty"`
}

package models

// DeletePartnersResponse - An object with a list of partners that were deleted.
type DeletePartnersResponse struct {

	// List of partners whose business partnership have been terminated.
	DeletedPartners []string `json:"deleted_partners,omitempty"`
}

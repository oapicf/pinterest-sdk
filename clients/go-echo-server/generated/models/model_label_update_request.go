package models

type LabelUpdateRequest struct {

	// Labels that you are applying to the campaign.
	Labels []LabelUpdateItem `json:"labels"`
}

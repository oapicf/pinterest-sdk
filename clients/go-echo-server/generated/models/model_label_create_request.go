package models

type LabelCreateRequest struct {

	// Labels that you are applying to the campaign.
	Labels []LabelCreateItem `json:"labels"`
}

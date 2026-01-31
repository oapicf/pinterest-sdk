package models

type LabelUpdateRequest struct {

	// Labels that you are applying to the campaign.
	Labels []LabelUpdateRequestLabelsInner `json:"labels"`
}

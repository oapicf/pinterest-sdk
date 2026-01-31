package models

type LabelCreateRequest struct {

	// Labels that you are applying to the campaign.
	Labels []LabelCreateRequestLabelsInner `json:"labels"`

	// Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	ParentId string `json:"parent_id" validate:"regexp=^[C]?\\\\d+$"`
}

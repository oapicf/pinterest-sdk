package models

type KeywordsRequest struct {

	// Keyword JSON array. Each array element has 3 fields
	Keywords []KeywordsCommon `json:"keywords"`

	// Keyword parent entity ID (advertiser, campaign, ad group).
	ParentId string `json:"parent_id" validate:"regexp=^((AG)|C)?\\\\d+$"`
}

package models

type CatalogsLocalStoresDelete200ResponseInner struct {

	// The ID of the local store.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	Status CampaignAdPreviewDelete200ResponseInnerStatus `json:"status"`
}

package models

// BulkDownloadRequest - Ad entities to get in bulk request.
type BulkDownloadRequest struct {

	// All entity types specified will be downloaded. Fewer types result in faster downloads.
	EntityTypes []BulkEntityType `json:"entity_types,omitempty"`

	// All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
	EntityIds []string `json:"entity_ids,omitempty"`

	// Unix UTC timestamp to retrieve all entities that have changed since this time.
	UpdatedSince string `json:"updated_since,omitempty"`

	CampaignFilter BulkDownloadRequestCampaignFilter `json:"campaign_filter,omitempty"`

	OutputFormat BulkOutputFormat `json:"output_format,omitempty"`
}

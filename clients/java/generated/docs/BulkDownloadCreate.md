

# BulkDownloadCreate

Resource create operation model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignFilter** | [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  |  [optional] |
|**entityIds** | **List&lt;String&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. |  [optional] |
|**entityTypes** | **List&lt;BulkEntityType&gt;** | All entity types specified will be downloaded. Fewer types result in faster downloads. |  [optional] |
|**outputFormat** | **BulkOutputFormat** |  |  [optional] |
|**updatedSince** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. |  [optional] |




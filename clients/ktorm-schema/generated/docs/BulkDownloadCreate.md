
# Table `BulkDownloadCreate`
(mapped from: BulkDownloadCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignFilter** | campaign_filter | long |  | [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  |  [optional] [foreignkey]
**entityIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. |  [optional]
**entityTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. |  [optional]
**outputFormat** | output_format | long |  | [**BulkOutputFormat**](BulkOutputFormat.md) |  |  [optional] [foreignkey]
**updatedSince** | updated_since | text |  | **kotlin.String** | Unix UTC timestamp to retrieve all entities that have changed since this time. |  [optional]



# **Table `BulkDownloadCreateEntityIds`**
(mapped from: BulkDownloadCreateEntityIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadCreate | bulkDownloadCreate | long | | kotlin.Long | Primary Key | *one*
entityIds | entityIds | text | | kotlin.String | Foreign Key | *many*



# **Table `BulkDownloadCreateBulkEntityType`**
(mapped from: BulkDownloadCreateBulkEntityType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadCreate | bulkDownloadCreate | long | | kotlin.Long | Primary Key | *one*
bulkEntityType | bulkEntityType | long | | kotlin.Long | Foreign Key | *many*






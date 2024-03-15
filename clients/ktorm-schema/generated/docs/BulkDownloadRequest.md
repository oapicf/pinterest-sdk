
# Table `BulkDownloadRequest`
(mapped from: BulkDownloadRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entityTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. |  [optional]
**entityIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. |  [optional]
**updatedSince** | updated_since | text |  | **kotlin.String** | Unix UTC timestamp to retrieve all entities that have changed since this time. |  [optional]
**campaignFilter** | campaign_filter | long |  | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  |  [optional] [foreignkey]
**outputFormat** | output_format | long |  | [**BulkOutputFormat**](BulkOutputFormat.md) |  |  [optional] [foreignkey]


# **Table `BulkDownloadRequestBulkEntityType`**
(mapped from: BulkDownloadRequestBulkEntityType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadRequest | bulkDownloadRequest | long | | kotlin.Long | Primary Key | *one*
bulkEntityType | bulkEntityType | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkDownloadRequestEntityIds`**
(mapped from: BulkDownloadRequestEntityIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadRequest | bulkDownloadRequest | long | | kotlin.Long | Primary Key | *one*
entityIds | entityIds | text | | kotlin.String | Foreign Key | *many*








# Table `BulkCampaignDeliveryEstimatesResponse`
(mapped from: BulkCampaignDeliveryEstimatesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BulkCampaignDeliveryEstimatesItem&gt;**](BulkCampaignDeliveryEstimatesItem.md) | Per-campaign delivery estimate results, in the same order as the request. | 


# **Table `BulkCampaignDeliveryEstimatesResponseBulkCampaignDeliveryEstimatesItem`**
(mapped from: BulkCampaignDeliveryEstimatesResponseBulkCampaignDeliveryEstimatesItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkCampaignDeliveryEstimatesResponse | bulkCampaignDeliveryEstimatesResponse | long | | kotlin.Long | Primary Key | *one*
bulkCampaignDeliveryEstimatesItem | bulkCampaignDeliveryEstimatesItem | long | | kotlin.Long | Foreign Key | *many*




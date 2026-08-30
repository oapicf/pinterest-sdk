
# Table `CampaignBatchWriteResponseModel`
(mapped from: CampaignBatchWriteResponseModel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignBatchItem&gt;**](CampaignBatchItem.md) |  | 


# **Table `CampaignBatchWriteResponseModelCampaignBatchItem`**
(mapped from: CampaignBatchWriteResponseModelCampaignBatchItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignBatchWriteResponseModel | campaignBatchWriteResponseModel | long | | kotlin.Long | Primary Key | *one*
campaignBatchItem | campaignBatchItem | long | | kotlin.Long | Foreign Key | *many*




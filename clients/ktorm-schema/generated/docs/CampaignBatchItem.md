
# Table `CampaignBatchItem`
(mapped from: CampaignBatchItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**CampaignBatchResponseData**](CampaignBatchResponseData.md) | Campaign data on success. |  [optional] [foreignkey]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Exception&gt;**](Exception.md) | Exceptions on failure. |  [optional]



# **Table `CampaignBatchItemException`**
(mapped from: CampaignBatchItemException)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignBatchItem | campaignBatchItem | long | | kotlin.Long | Primary Key | *one*
exception | exception | long | | kotlin.Long | Foreign Key | *many*





# Table `CampaignUpdateResponse`
(mapped from: CampaignUpdateResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignCreateResponseItem&gt;**](CampaignCreateResponseItem.md) |  |  [optional]


# **Table `CampaignUpdateResponseCampaignCreateResponseItem`**
(mapped from: CampaignUpdateResponseCampaignCreateResponseItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignUpdateResponse | campaignUpdateResponse | long | | kotlin.Long | Primary Key | *one*
campaignCreateResponseItem | campaignCreateResponseItem | long | | kotlin.Long | Foreign Key | *many*





# Table `CampaignCreateResponse`
(mapped from: CampaignCreateResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignCreateResponseItem&gt;**](CampaignCreateResponseItem.md) |  |  [optional]


# **Table `CampaignCreateResponseCampaignCreateResponseItem`**
(mapped from: CampaignCreateResponseCampaignCreateResponseItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignCreateResponse | campaignCreateResponse | long | | kotlin.Long | Primary Key | *one*
campaignCreateResponseItem | campaignCreateResponseItem | long | | kotlin.Long | Foreign Key | *many*




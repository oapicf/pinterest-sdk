
# Table `campaigns_list_200_response`
(mapped from: CampaignsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignResponse&gt;**](CampaignResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CampaignsList200ResponseCampaignResponse`**
(mapped from: CampaignsList200ResponseCampaignResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignsList200Response | campaignsList200Response | long | | kotlin.Long | Primary Key | *one*
campaignResponse | campaignResponse | long | | kotlin.Long | Foreign Key | *many*





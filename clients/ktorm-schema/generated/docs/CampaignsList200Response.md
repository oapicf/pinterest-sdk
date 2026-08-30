
# Table `campaigns_list_200_response`
(mapped from: CampaignsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Campaign&gt;**](Campaign.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CampaignsList200ResponseCampaign`**
(mapped from: CampaignsList200ResponseCampaign)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignsList200Response | campaignsList200Response | long | | kotlin.Long | Primary Key | *one*
campaign | campaign | long | | kotlin.Long | Foreign Key | *many*





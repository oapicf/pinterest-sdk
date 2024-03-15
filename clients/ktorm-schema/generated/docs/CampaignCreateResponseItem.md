
# Table `CampaignCreateResponseItem`
(mapped from: CampaignCreateResponseItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**CampaignCreateResponseData**](CampaignCreateResponseData.md) |  |  [optional] [foreignkey]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Exception&gt;**](Exception.md) |  |  [optional]



# **Table `CampaignCreateResponseItemException`**
(mapped from: CampaignCreateResponseItemException)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignCreateResponseItem | campaignCreateResponseItem | long | | kotlin.Long | Primary Key | *one*
exception | exception | long | | kotlin.Long | Foreign Key | *many*




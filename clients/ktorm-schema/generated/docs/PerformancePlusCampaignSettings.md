
# Table `PerformancePlusCampaignSettings`
(mapped from: PerformancePlusCampaignSettings)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**boostProspectingAdGroupBid** | boost_prospecting_ad_group_bid | boolean |  | **kotlin.Boolean** | Whether to boost prospecting ad group bid. |  [optional]
**pinnerListExclusions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of campaign-level exclusion pinner list IDs. |  [optional]



# **Table `PerformancePlusCampaignSettingsPinnerListExclusions`**
(mapped from: PerformancePlusCampaignSettingsPinnerListExclusions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
performancePlusCampaignSettings | performancePlusCampaignSettings | long | | kotlin.Long | Primary Key | *one*
pinnerListExclusions | pinnerListExclusions | text | | kotlin.String | Foreign Key | *many*




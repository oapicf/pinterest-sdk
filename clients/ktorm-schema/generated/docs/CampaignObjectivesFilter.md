
# Table `CampaignObjectivesFilter`
(mapped from: CampaignObjectivesFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignObjectiveTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. |  [optional]


# **Table `CampaignObjectivesFilterObjectiveType`**
(mapped from: CampaignObjectivesFilterObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignObjectivesFilter | campaignObjectivesFilter | long | | kotlin.Long | Primary Key | *one*
objectiveType | objectiveType | long | | kotlin.Long | Foreign Key | *many*




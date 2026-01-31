
# Table `TargetingTypeFilter`
(mapped from: TargetingTypeFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**targetingTypes** | `One-To-Many` | `----` | `----`  | [**targeting_types**](#kotlin.Array&lt;TargetingTypes&gt;) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AUDIENCE_MULTIPLIER\&quot;] is only available in CAMPAIGN_TARGETING level. [\&quot;MEDIA_TYPE\&quot;] is only available in PRODUCT_ITEM_TARGETING level. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |  [optional]


# **Table `TargetingTypeFilterTargetingTypes`**
(mapped from: TargetingTypeFilterTargetingTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTypeFilter | targetingTypeFilter | long | | kotlin.Long | Primary Key | *one*
targetingTypes | targetingTypes | text | | kotlin.String | Foreign Key | *many*




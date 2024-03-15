
# Table `TargetingTypeFilter`
(mapped from: TargetingTypeFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**targetingTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. |  [optional]


# **Table `TargetingTypeFilterAdsAnalyticsTargetingType`**
(mapped from: TargetingTypeFilterAdsAnalyticsTargetingType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTypeFilter | targetingTypeFilter | long | | kotlin.Long | Primary Key | *one*
adsAnalyticsTargetingType | adsAnalyticsTargetingType | long | | kotlin.Long | Foreign Key | *many*




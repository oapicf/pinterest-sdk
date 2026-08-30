
# Table `AdgroupTrackingFeatures`
(mapped from: AdgroupTrackingFeatures)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**enabled** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdgroupTrackingFeatureType&gt;**](AdgroupTrackingFeatureType.md) | Tracking features. To clear this field, set to null. |  [optional]


# **Table `AdgroupTrackingFeaturesAdgroupTrackingFeatureType`**
(mapped from: AdgroupTrackingFeaturesAdgroupTrackingFeatureType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adgroupTrackingFeatures | adgroupTrackingFeatures | long | | kotlin.Long | Primary Key | *one*
adgroupTrackingFeatureType | adgroupTrackingFeatureType | long | | kotlin.Long | Foreign Key | *many*




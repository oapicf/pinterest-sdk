
# Table `ad_groups_create_200_response`
(mapped from: AdGroupsCreate200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupsCreate200ResponseItemsInner&gt;**](AdGroupsCreate200ResponseItemsInner.md) |  | 


# **Table `AdGroupsCreate200ResponseAdGroupsCreate200ResponseItemsInner`**
(mapped from: AdGroupsCreate200ResponseAdGroupsCreate200ResponseItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupsCreate200Response | adGroupsCreate200Response | long | | kotlin.Long | Primary Key | *one*
adGroupsCreate200ResponseItemsInner | adGroupsCreate200ResponseItemsInner | long | | kotlin.Long | Foreign Key | *many*




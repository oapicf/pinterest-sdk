
# Table `ad_groups_list_200_response`
(mapped from: AdGroupsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroup&gt;**](AdGroup.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdGroupsList200ResponseAdGroup`**
(mapped from: AdGroupsList200ResponseAdGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupsList200Response | adGroupsList200Response | long | | kotlin.Long | Primary Key | *one*
adGroup | adGroup | long | | kotlin.Long | Foreign Key | *many*





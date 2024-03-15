
# Table `ad_groups_list_200_response`
(mapped from: AdGroupsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupResponse&gt;**](AdGroupResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdGroupsList200ResponseAdGroupResponse`**
(mapped from: AdGroupsList200ResponseAdGroupResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupsList200Response | adGroupsList200Response | long | | kotlin.Long | Primary Key | *one*
adGroupResponse | adGroupResponse | long | | kotlin.Long | Foreign Key | *many*





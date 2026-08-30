
# Table `ad_groups_create_200_response_items_inner`
(mapped from: AdGroupsCreate200ResponseItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**AdGroup**](AdGroup.md) |  |  [optional] [foreignkey]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinterestLibBatchItemException&gt;**](PinterestLibBatchItemException.md) |  |  [optional]



# **Table `AdGroupsCreate200ResponseItemsInnerPinterestLibBatchItemException`**
(mapped from: AdGroupsCreate200ResponseItemsInnerPinterestLibBatchItemException)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupsCreate200ResponseItemsInner | adGroupsCreate200ResponseItemsInner | long | | kotlin.Long | Primary Key | *one*
pinterestLibBatchItemException | pinterestLibBatchItemException | long | | kotlin.Long | Foreign Key | *many*





# Table `items_post_200_response`
(mapped from: ItemsPost200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemResponse&gt;**](ItemResponse.md) |  | 


# **Table `ItemsPost200ResponseItemResponse`**
(mapped from: ItemsPost200ResponseItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemsPost200Response | itemsPost200Response | long | | kotlin.Long | Primary Key | *one*
itemResponse | itemResponse | long | | kotlin.Long | Foreign Key | *many*




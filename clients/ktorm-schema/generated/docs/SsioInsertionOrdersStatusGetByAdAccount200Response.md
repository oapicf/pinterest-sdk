
# Table `ssio_insertion_orders_status_get_by_ad_account_200_response`
(mapped from: SsioInsertionOrdersStatusGetByAdAccount200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SSIOInsertionOrderStatus&gt;**](SSIOInsertionOrderStatus.md) | Insertion orders status by ad acount id | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `SsioInsertionOrdersStatusGetByAdAccount200ResponseSSIOInsertionOrderStatus`**
(mapped from: SsioInsertionOrdersStatusGetByAdAccount200ResponseSSIOInsertionOrderStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ssioInsertionOrdersStatusGetByAdAccount200Response | ssioInsertionOrdersStatusGetByAdAccount200Response | long | | kotlin.Long | Primary Key | *one*
sSIOInsertionOrderStatus | sSIOInsertionOrderStatus | long | | kotlin.Long | Foreign Key | *many*





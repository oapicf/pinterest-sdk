
# Table `ConversionEventsDataItemsCustomDataContentsItems`
(mapped from: ConversionEventsDataItemsCustomDataContentsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**itemBrand** | item_brand | text |  | **kotlin.String** | The brand of a product. |  [optional]
**itemBrandId** | item_brand_id | text |  | **kotlin.String** | The brand ID of a product. |  [optional]
**itemCategory** | item_category | text |  | **kotlin.String** | The category of a product. |  [optional]
**itemName** | item_name | text |  | **kotlin.String** | The name of a product. |  [optional]
**itemPrice** | item_price | text |  | **kotlin.String** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**quantity** | quantity | long |  | **kotlin.Long** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]










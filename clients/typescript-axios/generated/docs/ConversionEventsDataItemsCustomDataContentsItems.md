# ConversionEventsDataItemsCustomDataContentsItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to undefined]
**item_brand** | **string** | The brand of a product. | [optional] [default to undefined]
**item_brand_id** | **string** | The brand ID of a product. | [optional] [default to undefined]
**item_category** | **string** | The category of a product. | [optional] [default to undefined]
**item_name** | **string** | The name of a product. | [optional] [default to undefined]
**item_price** | **string** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to undefined]
**quantity** | **number** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to undefined]

## Example

```typescript
import { ConversionEventsDataItemsCustomDataContentsItems } from './api';

const instance: ConversionEventsDataItemsCustomDataContentsItems = {
    id,
    item_brand,
    item_brand_id,
    item_category,
    item_name,
    item_price,
    quantity,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# ConversionEventsDataInnerCustomData

Object containing other custom data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **string** | The ISO-4217 currency code. If not provided, we will default to the advertiser\&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] [default to undefined]
**value** | **string** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] [default to undefined]
**content_ids** | **Array&lt;string&gt;** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] [default to undefined]
**content_name** | **string** | The name of the page or product associated with the event. | [optional] [default to undefined]
**content_category** | **string** | The category of the content associated with the event. | [optional] [default to undefined]
**content_brand** | **string** | The brand of the content associated with the event. | [optional] [default to undefined]
**contents** | [**Array&lt;ConversionEventsDataInnerCustomDataContentsInner&gt;**](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] [default to undefined]
**num_items** | **number** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] [default to undefined]
**order_id** | **string** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] [default to undefined]
**search_string** | **string** | The search string related to the user conversion event. | [optional] [default to undefined]
**opt_out_type** | **string** | Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Help Center&lt;/a&gt; and &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;dev site&lt;/a&gt; for specific opt_out_type set up. | [optional] [default to undefined]
**np** | **string** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] [default to undefined]

## Example

```typescript
import { ConversionEventsDataInnerCustomData } from './api';

const instance: ConversionEventsDataInnerCustomData = {
    currency,
    value,
    content_ids,
    content_name,
    content_category,
    content_brand,
    contents,
    num_items,
    order_id,
    search_string,
    opt_out_type,
    np,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

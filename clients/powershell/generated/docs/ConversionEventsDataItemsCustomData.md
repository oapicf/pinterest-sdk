# ConversionEventsDataItemsCustomData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentBrand** | **String** | The brand of the content associated with the event. | [optional] 
**ContentCategory** | **String** | The category of the content associated with the event. | [optional] 
**ContentIds** | **String[]** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**ContentName** | **String** | The name of the page or product associated with the event. | [optional] 
**Contents** | [**ConversionEventsDataItemsCustomDataContentsItems[]**](ConversionEventsDataItemsCustomDataContentsItems.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**Currency** | **String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] 
**ExternalMeasurementId** | **String** | Only use when instructed. | [optional] 
**ExternalMeasurementVendorId** | **Int32** | Only use when instructed. | [optional] 
**Np** | **String** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] 
**NumItems** | **Int64** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**OptOutType** | **String** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. | [optional] 
**OrderId** | **String** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] 
**PredictedLtv** | **String** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. | [optional] 
**SearchString** | **String** | The search string related to the user conversion event. | [optional] 
**Value** | **String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventsDataItemsCustomData = Initialize-PSOpenAPIToolsConversionEventsDataItemsCustomData  -ContentBrand null `
 -ContentCategory null `
 -ContentIds null `
 -ContentName null `
 -Contents null `
 -Currency null `
 -ExternalMeasurementId null `
 -ExternalMeasurementVendorId null `
 -Np null `
 -NumItems null `
 -OptOutType null `
 -OrderId null `
 -PredictedLtv null `
 -SearchString null `
 -Value null
```

- Convert the resource to JSON
```powershell
$ConversionEventsDataItemsCustomData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


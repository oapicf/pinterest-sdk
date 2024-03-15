# ConversionEventsDataInnerCustomData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | Option<**String**> | The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional]
**value** | Option<**String**> | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional]
**content_ids** | Option<**Vec<String>**> | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). | [optional]
**content_name** | Option<**String**> | The name of the page or product associated with the event. | [optional]
**content_category** | Option<**String**> | The category of the content associated with the event. | [optional]
**content_brand** | Option<**String**> | The brand of the content associated with the event. | [optional]
**contents** | Option<[**Vec<models::ConversionEventsDataInnerCustomDataContentsInner>**](ConversionEvents_data_inner_custom_data_contents_inner.md)> | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). | [optional]
**num_items** | Option<**i64**> | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). | [optional]
**order_id** | Option<**String**> | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional]
**search_string** | Option<**String**> | The search string related to the user conversion event. | [optional]
**opt_out_type** | Option<**String**> | Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up. | [optional]
**np** | Option<**String**> | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



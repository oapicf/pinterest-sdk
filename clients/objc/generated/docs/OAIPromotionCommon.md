# OAIPromotionCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountStatus** | **NSString*** | Discount status based on the current time and start and end time of discount | [optional] 
**endTime** | **NSNumber*** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**externalId** | **NSString*** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**platformType** | **NSString*** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**promotionCode** | **NSString*** | Code that can be used to redeem a promotion. | [optional] 
**promotionCustomId** | **NSString*** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**promotionTitle** | **NSString*** | Internal name for the promotion. | [optional] 
**promotionType** | [**OAIPromotionType***](OAIPromotionType.md) |  | [optional] 
**startTime** | **NSNumber*** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**templateValues** | [**NSArray&lt;OAIPromotionTemplateValue&gt;***](OAIPromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



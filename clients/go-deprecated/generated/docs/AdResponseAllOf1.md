# AdResponseAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**CampaignId** | **string** | ID of the ad campaign that contains this ad. | [optional] 
**CollectionItemsDestinationUrlTemplate** | Pointer to **string** | Destination URL template for all items within a collections drawer. | [optional] 
**CreatedTime** | **int32** | Pin creation time. Unix timestamp in seconds. | [optional] 
**Id** | **string** | The ID of this ad. | [optional] 
**RejectedReasons** | **[]string** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**RejectionLabels** | **[]string** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**ReviewStatus** | **string** | Ad review status | [optional] 
**Type** | **string** | Always \&quot;ad\&quot;. | [optional] 
**UpdatedTime** | **int32** | Last update time. Unix timestamp in seconds. | [optional] 
**SummaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



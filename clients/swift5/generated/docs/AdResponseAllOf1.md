# AdResponseAllOf1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaignId** | **String** | ID of the ad campaign that contains this ad. | [optional] 
**collectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. | [optional] 
**createdTime** | **Int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **String** | The ID of this ad. | [optional] 
**rejectedReasons** | **[String]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejectionLabels** | **[String]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**reviewStatus** | **String** | Ad review status | [optional] 
**type** | **String** | Always \&quot;ad\&quot;. | [optional] 
**updatedTime** | **Int** | Last update time. Unix timestamp in seconds. | [optional] 
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



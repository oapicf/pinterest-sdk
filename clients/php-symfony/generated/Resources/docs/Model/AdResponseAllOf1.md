# AdResponseAllOf1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaignId** | **string** | ID of the ad campaign that contains this ad. | [optional] 
**collectionItemsDestinationUrlTemplate** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**createdTime** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **string** | The ID of this ad. | [optional] 
**rejectedReasons** | **string** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejectionLabels** | **string** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**reviewStatus** | **string** | Ad review status | [optional] 
**type** | **string** | Always \&quot;ad\&quot;. | [optional] 
**updatedTime** | **int** | Last update time. Unix timestamp in seconds. | [optional] 
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



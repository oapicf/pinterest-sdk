# OAIAdResponseAllOf1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaignId** | **NSString*** | ID of the ad campaign that contains this ad. | [optional] 
**collectionItemsDestinationUrlTemplate** | **NSString*** | Destination URL template for all items within a collections drawer. | [optional] 
**createdTime** | **NSNumber*** | Pin creation time. Unix timestamp in seconds. | [optional] 
**_id** | **NSString*** | The ID of this ad. | [optional] 
**rejectedReasons** | **NSArray&lt;NSString*&gt;*** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejectionLabels** | **NSArray&lt;NSString*&gt;*** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**reviewStatus** | **NSString*** | Ad review status | [optional] 
**type** | **NSString*** | Always \&quot;ad\&quot;. | [optional] 
**updatedTime** | **NSNumber*** | Last update time. Unix timestamp in seconds. | [optional] 
**summaryStatus** | [**OAIPinPromotionSummaryStatus***](OAIPinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



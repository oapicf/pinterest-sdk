
# Org.OpenAPITools.Model.AdResponseAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**CampaignId** | **string** | ID of the ad campaign that contains this ad. | [optional] 
**CollectionItemsDestinationUrlTemplate** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**CreatedTime** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**Id** | **string** | The ID of this ad. | [optional] 
**RejectedReasons** | **List&lt;string&gt;** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**RejectionLabels** | **List&lt;string&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**ReviewStatus** | **string** | Ad review status | [optional] 
**Type** | **string** | Always \&quot;ad\&quot;. | [optional] 
**UpdatedTime** | **int** | Last update time. Unix timestamp in seconds. | [optional] 
**SummaryStatus** | **PinPromotionSummaryStatus** | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)


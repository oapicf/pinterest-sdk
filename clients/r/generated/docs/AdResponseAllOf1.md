# openapi::AdResponseAllOf1


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaign_id** | **character** | ID of the ad campaign that contains this ad. | [optional] 
**collection_items_destination_url_template** | **character** | Destination URL template for all items within a collections drawer. | [optional] 
**created_time** | **integer** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **character** | The ID of this ad. | [optional] 
**rejected_reasons** | **array[character]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejection_labels** | **array[character]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**review_status** | **character** | Ad review status | [optional] 
**type** | **character** | Always \&quot;ad\&quot;. | [optional] 
**updated_time** | **integer** | Last update time. Unix timestamp in seconds. | [optional] 
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 



# openapi::AdResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **character** | ID of the ad group that contains the ad. | [optional] [Pattern: ^(AG)?\\d+$] 
**android_deep_link** | **character** | Deep link URL for Android devices. | [optional] 
**carousel_android_deep_links** | **array[character]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **array[character]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **array[character]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **character** | Tracking url for the ad clicks. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [Enum: ] 
**destination_url** | **character** | Destination URL. | [optional] 
**ios_deep_link** | **character** | Deep link URL for iOS devices. | [optional] 
**is_pin_deleted** | **character** | Is original pin deleted? | [optional] 
**is_removable** | **character** | Is pin repinnable? | [optional] 
**name** | **character** | Name of the ad - 255 chars max. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [Enum: ] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**view_tracking_url** | **character** | Tracking URL for ad impressions. | [optional] 
**lead_form_id** | **character** | Lead form ID for lead ad generation. | [optional] [Pattern: ^(AG)?\\d+$] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [Enum: ] 
**customizable_cta_type** | **character** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] [Enum: [GET_OFFER, LEARN_MORE, ORDER_NOW, SHOP_NOW, SIGN_UP, SUBSCRIBE, BUY_NOW, CONTACT_US, GET_QUOTE, VISIT_SITE, APPLY_NOW, BOOK_NOW, REQUEST_DEMO, REGISTER_NOW, FIND_A_DEALER, ADD_TO_CART, WATCH_NOW, READ_MORE]] 
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**pin_id** | **character** | Pin ID. | [optional] [Pattern: ^\\d+$] 
**ad_account_id** | **character** | The ID of the advertiser that this ad belongs to. | [optional] [Pattern: ^\\d+$] 
**campaign_id** | **character** | ID of the ad campaign that contains this ad. | [optional] [Pattern: ^\\d+$] 
**collection_items_destination_url_template** | **character** | Destination URL template for all items within a collections drawer. | [optional] 
**created_time** | **integer** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **character** | The ID of this ad. | [optional] [Pattern: ^\\d+$] 
**rejected_reasons** | **array[character]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [Enum: ] 
**rejection_labels** | **array[character]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**review_status** | **character** | Ad review status | [optional] [Enum: [OTHER, PENDING, REJECTED, APPROVED]] 
**type** | **character** | Always \&quot;ad\&quot;. | [optional] 
**updated_time** | **integer** | Last update time. Unix timestamp in seconds. | [optional] 
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] [Enum: ] 



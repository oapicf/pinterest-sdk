# pinterestsdk.model.ad_response.AdResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[AdCommon](AdCommon.md) | [**AdCommon**](AdCommon.md) | [**AdCommon**](AdCommon.md) |  | 
[all_of_1](#all_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# all_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ad_account_id** | str,  | str,  | The ID of the advertiser that this ad belongs to. | [optional] 
**campaign_id** | str,  | str,  | ID of the ad campaign that contains this ad. | [optional] 
**collection_items_destination_url_template** | None, str,  | NoneClass, str,  | Destination URL template for all items within a collections drawer. | [optional] 
**created_time** | decimal.Decimal, int,  | decimal.Decimal,  | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | str,  | str,  | The ID of this ad. | [optional] 
**[rejected_reasons](#rejected_reasons)** | list, tuple,  | tuple,  | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**[rejection_labels](#rejection_labels)** | list, tuple,  | tuple,  | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**review_status** | str,  | str,  | Ad review status | [optional] must be one of ["OTHER", "PENDING", "REJECTED", "APPROVED", ] 
**type** | str,  | str,  | Always \&quot;ad\&quot;. | [optional] 
**updated_time** | decimal.Decimal, int,  | decimal.Decimal,  | Last update time. Unix timestamp in seconds. | [optional] 
**[summary_status](#summary_status)** | str,  | str,  | Ad summary status | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# rejected_reasons

Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  | ad disapproval reasons | must be one of ["HASHTAGS", "PROMOTIONS_AND_PRICES", "TARGETING", "LANDING_PAGE", "CAPS_AND_SYMBOLS", "SHOCKING", "WEIGHT_LOSS", "PROHIBITED_PRODUCT", "AUTHENTICITY", "NUDITY", "CONFUSING_DESIGN", "URGENCY", "RATINGS", "APP", "ALCOHOL", "CONTESTS", "POLITICAL", "OTHER", "IMAGE", "NAR", "INCONSISTENT", "CLICKBAIT", "NO_DESCRIPTION", "LOW_QUALITY", "EXAGGERATED_CLAIMS", "PINTEREST_BRAND", "ALCOHOL_NO_SALE", "LANDING_PAGE_SPEED", "LANDING_PAGE_HARDWALL", "LANDING_PAGE_BROKEN", "LANDING_PAGE_QUALITY", "OUT_OF_STOCK", "IMAGE_LOW_QUALITY", "IMAGE_BUSY", "IMAGE_POORLY_EDITED", "IMAGE_BEFORE_AFTER", "UGC", "FAKE_BUTTONS", "WEAPONS", "SENSITIVE", "UNACCEPTABLE_BUSINESS", "SUSPICIOUS_CLAIMS", "PHARMA", "SUSPICIOUS_SUPPLEMENTS", "ILLEGAL_RECREATIONAL_DRUG", "LOW_QUALITY_LANDING_PAGE", "RESTRICTED_HEALTHCARE", "INCONSISTENT_LANG_FR", ] 

# rejection_labels

Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# summary_status

Ad summary status

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | Ad summary status | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[PinPromotionSummaryStatus](PinPromotionSummaryStatus.md) | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


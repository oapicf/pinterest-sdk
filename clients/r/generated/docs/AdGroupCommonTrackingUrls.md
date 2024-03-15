# openapi::AdGroupCommonTrackingUrls

Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**impression** | **array[character]** |  | [optional] 
**click** | **array[character]** |  | [optional] 
**engagement** | **array[character]** |  | [optional] 
**buyable_button** | **array[character]** |  | [optional] 
**audience_verification** | **array[character]** |  | [optional] 



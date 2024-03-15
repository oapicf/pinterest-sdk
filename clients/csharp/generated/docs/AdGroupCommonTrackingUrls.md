# Org.OpenAPITools.Model.AdGroupCommonTrackingUrls
Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Impression** | **List&lt;string&gt;** |  | [optional] 
**Click** | **List&lt;string&gt;** |  | [optional] 
**Engagement** | **List&lt;string&gt;** |  | [optional] 
**BuyableButton** | **List&lt;string&gt;** |  | [optional] 
**AudienceVerification** | **List&lt;string&gt;** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


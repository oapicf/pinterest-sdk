# TargetingSpec
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGEBUCKET** | **String[]** | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. | [optional] 
**APPTYPE** | **String[]** | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. | [optional] 
**AUDIENCEEXCLUDE** | **String[]** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [&quot;&quot;2542620905475&quot;&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. | [optional] 
**AUDIENCEINCLUDE** | **String[]** | Targeted customer list IDs. For example: [&quot;&quot;2542620905473&quot;&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. | [optional] 
**GENDER** | **String[]** | Targeted genders. Values: [&quot;&quot;unknown&quot;&quot;,&quot;&quot;male&quot;&quot;,&quot;&quot;female&quot;&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. | [optional] 
**GEO** | **String[]** | Location region codes, e.g., &quot;&quot;BE-VOV&quot;&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., &quot;&quot;US-94107&quot;&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. | [optional] 
**INTEREST** | **String[]** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. | [optional] 
**LOCALE** | **String[]** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. | [optional] 
**LOCATION** | **String[]** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [&quot;&quot;US&quot;&quot;, &quot;&quot;807&quot;&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. | [optional] 
**SHOPPINGRETARGETING** | [**TargetingSpecSHOPPINGRETARGETING[]**](TargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**TARGETINGSTRATEGY** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingSpec = Initialize-PSOpenAPIToolsTargetingSpec  -AGEBUCKET [&quot;35-44&quot;,&quot;50-54&quot;] `
 -APPTYPE [&quot;ipad&quot;,&quot;iphone&quot;] `
 -AUDIENCEEXCLUDE null `
 -AUDIENCEINCLUDE null `
 -GENDER null `
 -GEO null `
 -INTEREST null `
 -LOCALE null `
 -LOCATION null `
 -SHOPPINGRETARGETING null `
 -TARGETINGSTRATEGY null
```

- Convert the resource to JSON
```powershell
$TargetingSpec | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# TargetingSpec
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGEBUCKET** | [**TargetingSpecAgeBucket[]**](TargetingSpecAgeBucket.md) | **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. | [optional] 
**APPTYPE** | [**TargetingSpecAppType[]**](TargetingSpecAppType.md) | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. | [optional] 
**AUDIENCEEXCLUDE** | **String[]** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [&quot;&quot;2542620905475&quot;&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. | [optional] 
**AUDIENCEINCLUDE** | **String[]** | Targeted customer list IDs. For example: [&quot;&quot;2542620905473&quot;&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. | [optional] 
**GENDER** | [**TargetingSpecGender[]**](TargetingSpecGender.md) | Targeted genders. Values: [&quot;&quot;unknown&quot;&quot;,&quot;&quot;male&quot;&quot;,&quot;&quot;female&quot;&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. | [optional] 
**GEO** | **String[]** | Location region codes, e.g., &quot;&quot;BE-VOV&quot;&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., &quot;&quot;US-94107&quot;&quot;. Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). | [optional] 
**INTEREST** | **String[]** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. | [optional] 
**LOCALE** | **String[]** | 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. | [optional] 
**LOCATION** | **String[]** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [&quot;&quot;US&quot;&quot;, &quot;&quot;807&quot;&quot;]). For complete list, &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;click here&lt;/a&gt;. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). | [optional] 
**MAXIMUMAGE** | **String** | Maximum age to target (inclusive). Values: &quot;&quot;18&quot;&quot;, &quot;&quot;19&quot;&quot;, ..., &quot;&quot;65&quot;&quot;, &quot;&quot;65+&quot;&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. | [optional] 
**MINIMUMAGE** | **String** | Minimum age to target (inclusive). Values: &quot;&quot;18&quot;&quot;, &quot;&quot;19&quot;&quot;, ..., &quot;&quot;65&quot;&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. | [optional] 
**SHOPPINGRETARGETING** | [**TargetingSpecShoppingRetargeting[]**](TargetingSpecShoppingRetargeting.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
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
 -MAXIMUMAGE 65+ `
 -MINIMUMAGE 18 `
 -SHOPPINGRETARGETING null `
 -TARGETINGSTRATEGY null
```

- Convert the resource to JSON
```powershell
$TargetingSpec | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


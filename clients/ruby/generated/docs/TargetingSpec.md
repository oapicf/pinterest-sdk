# PinterestSdkClient::TargetingSpec

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **age_bucket** | **Array&lt;String&gt;** | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. | [optional] |
| **apptype** | **Array&lt;String&gt;** | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. | [optional] |
| **audience_exclude** | **Array&lt;String&gt;** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. | [optional] |
| **audience_include** | **Array&lt;String&gt;** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. | [optional] |
| **gender** | **Array&lt;String&gt;** | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. | [optional] |
| **geo** | **Array&lt;String&gt;** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). | [optional] |
| **interest** | **Array&lt;String&gt;** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. | [optional] |
| **locale** | **Array&lt;String&gt;** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**. | [optional] |
| **location** | **Array&lt;String&gt;** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). | [optional] |
| **shopping_retargeting** | [**Array&lt;TargetingSpecSHOPPINGRETARGETING&gt;**](TargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] |
| **targeting_strategy** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingSpec.new(
  age_bucket: [&quot;35-44&quot;,&quot;50-54&quot;],
  apptype: [&quot;ipad&quot;,&quot;iphone&quot;],
  audience_exclude: null,
  audience_include: null,
  gender: null,
  geo: null,
  interest: null,
  locale: null,
  location: null,
  shopping_retargeting: null,
  targeting_strategy: null
)
```


# PinterestSdk.TargetingSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGE_BUCKET** | **[String]** | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. | [optional] 
**APPTYPE** | **[String]** | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. | [optional] 
**AUDIENCE_EXCLUDE** | **[String]** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. | [optional] 
**AUDIENCE_INCLUDE** | **[String]** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. | [optional] 
**GENDER** | **[String]** | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. | [optional] 
**GEO** | **[String]** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). | [optional] 
**INTEREST** | **[String]** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. | [optional] 
**LOCALE** | **[String]** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**. | [optional] 
**LOCATION** | **[String]** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). | [optional] 
**SHOPPING_RETARGETING** | [**[TargetingSpecSHOPPINGRETARGETING]**](TargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**TARGETING_STRATEGY** | **[String]** |  | [optional] 



## Enum: [AGEBUCKETEnum]


* `18-24` (value: `"18-24"`)

* `21+` (value: `"21+"`)

* `25-34` (value: `"25-34"`)

* `35-44` (value: `"35-44"`)

* `45-49` (value: `"45-49"`)

* `50-54` (value: `"50-54"`)

* `55-64` (value: `"55-64"`)

* `65+` (value: `"65+"`)





## Enum: [APPTYPEEnum]


* `android_mobile` (value: `"android_mobile"`)

* `android_tablet` (value: `"android_tablet"`)

* `ipad` (value: `"ipad"`)

* `iphone` (value: `"iphone"`)

* `web` (value: `"web"`)

* `web_mobile` (value: `"web_mobile"`)





## Enum: [GENDEREnum]


* `unknown` (value: `"unknown"`)

* `male` (value: `"male"`)

* `female` (value: `"female"`)





## Enum: [TARGETINGSTRATEGYEnum]


* `CHOOSE_YOUR_OWN` (value: `"CHOOSE_YOUR_OWN"`)

* `FIND_NEW_CUSTOMERS` (value: `"FIND_NEW_CUSTOMERS"`)

* `RECONNECT_WITH_USERS` (value: `"RECONNECT_WITH_USERS"`)





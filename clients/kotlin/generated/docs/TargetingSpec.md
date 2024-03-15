
# TargetingSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGE_BUCKET** | [**inline**](#kotlin.collections.List&lt;AGEBUCKET&gt;) | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. |  [optional]
**APPTYPE** | [**inline**](#kotlin.collections.List&lt;APPTYPE&gt;) | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. |  [optional]
**AUDIENCE_EXCLUDE** | **kotlin.collections.List&lt;kotlin.String&gt;** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. |  [optional]
**auDIENCEINCLUDEQuote** | **kotlin.collections.List&lt;kotlin.String&gt;** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. |  [optional]
**GENDER** | [**inline**](#kotlin.collections.List&lt;GENDER&gt;) | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. |  [optional]
**GEO** | **kotlin.collections.List&lt;kotlin.String&gt;** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. |  [optional]
**INTEREST** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. |  [optional]
**LOCALE** | **kotlin.collections.List&lt;kotlin.String&gt;** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. |  [optional]
**LOCATION** | **kotlin.collections.List&lt;kotlin.String&gt;** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. |  [optional]
**SHOPPING_RETARGETING** | [**kotlin.collections.List&lt;TargetingSpecSHOPPINGRETARGETING&gt;**](TargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting |  [optional]
**TARGETING_STRATEGY** | [**inline**](#kotlin.collections.List&lt;TARGETINGSTRATEGY&gt;) |  |  [optional]


<a id="kotlin.collections.List<AGEBUCKET>"></a>
## Enum: AGE_BUCKET
Name | Value
---- | -----
AGE_BUCKET | 18-24, 21+, 25-34, 35-44, 45-49, 50-54, 55-64, 65+


<a id="kotlin.collections.List<APPTYPE>"></a>
## Enum: APPTYPE
Name | Value
---- | -----
APPTYPE | android_mobile, android_tablet, ipad, iphone, web, web_mobile


<a id="kotlin.collections.List<GENDER>"></a>
## Enum: GENDER
Name | Value
---- | -----
GENDER | unknown, male, female


<a id="kotlin.collections.List<TARGETINGSTRATEGY>"></a>
## Enum: TARGETING_STRATEGY
Name | Value
---- | -----
TARGETING_STRATEGY | CHOOSE_YOUR_OWN, FIND_NEW_CUSTOMERS, RECONNECT_WITH_USERS




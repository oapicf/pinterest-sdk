

# TargetingSpec

Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**AGE_BUCKET** | [**List&lt;AGEBUCKETEnum&gt;**](#List&lt;AGEBUCKETEnum&gt;) | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. |  [optional] |
|**APPTYPE** | [**List&lt;APPTYPEEnum&gt;**](#List&lt;APPTYPEEnum&gt;) | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. |  [optional] |
|**AUDIENCE_EXCLUDE** | **List&lt;String&gt;** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. |  [optional] |
|**AUDIENCE_INCLUDE** | **List&lt;String&gt;** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. |  [optional] |
|**GENDER** | [**List&lt;GENDEREnum&gt;**](#List&lt;GENDEREnum&gt;) | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. |  [optional] |
|**GEO** | **List&lt;String&gt;** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). |  [optional] |
|**INTEREST** | **List&lt;String&gt;** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. |  [optional] |
|**LOCALE** | **List&lt;String&gt;** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**. |  [optional] |
|**LOCATION** | **List&lt;String&gt;** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). |  [optional] |
|**SHOPPING_RETARGETING** | [**List&lt;TargetingSpecSHOPPINGRETARGETING&gt;**](TargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting |  [optional] |
|**TARGETING_STRATEGY** | [**List&lt;TARGETINGSTRATEGYEnum&gt;**](#List&lt;TARGETINGSTRATEGYEnum&gt;) |  |  [optional] |



## Enum: List&lt;AGEBUCKETEnum&gt;

| Name | Value |
|---- | -----|
| _18_24 | &quot;18-24&quot; |
| _21_ | &quot;21+&quot; |
| _25_34 | &quot;25-34&quot; |
| _35_44 | &quot;35-44&quot; |
| _45_49 | &quot;45-49&quot; |
| _50_54 | &quot;50-54&quot; |
| _55_64 | &quot;55-64&quot; |
| _65_ | &quot;65+&quot; |



## Enum: List&lt;APPTYPEEnum&gt;

| Name | Value |
|---- | -----|
| ANDROID_MOBILE | &quot;android_mobile&quot; |
| ANDROID_TABLET | &quot;android_tablet&quot; |
| IPAD | &quot;ipad&quot; |
| IPHONE | &quot;iphone&quot; |
| WEB | &quot;web&quot; |
| WEB_MOBILE | &quot;web_mobile&quot; |



## Enum: List&lt;GENDEREnum&gt;

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;unknown&quot; |
| MALE | &quot;male&quot; |
| FEMALE | &quot;female&quot; |



## Enum: List&lt;TARGETINGSTRATEGYEnum&gt;

| Name | Value |
|---- | -----|
| CHOOSE_YOUR_OWN | &quot;CHOOSE_YOUR_OWN&quot; |
| FIND_NEW_CUSTOMERS | &quot;FIND_NEW_CUSTOMERS&quot; |
| RECONNECT_WITH_USERS | &quot;RECONNECT_WITH_USERS&quot; |




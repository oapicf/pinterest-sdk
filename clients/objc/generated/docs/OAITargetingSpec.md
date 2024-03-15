# OAITargetingSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aGEBUCKET** | **NSArray&lt;NSString*&gt;*** | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. | [optional] 
**aPPTYPE** | **NSArray&lt;NSString*&gt;*** | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. | [optional] 
**aUDIENCEEXCLUDE** | **NSArray&lt;NSString*&gt;*** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. | [optional] 
**aUDIENCEINCLUDE** | **NSArray&lt;NSString*&gt;*** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. | [optional] 
**gENDER** | **NSArray&lt;NSString*&gt;*** | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. | [optional] 
**gEO** | **NSArray&lt;NSString*&gt;*** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. | [optional] 
**iNTEREST** | **NSArray&lt;NSString*&gt;*** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. | [optional] 
**lOCALE** | **NSArray&lt;NSString*&gt;*** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. | [optional] 
**lOCATION** | **NSArray&lt;NSString*&gt;*** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. | [optional] 
**sHOPPINGRETARGETING** | [**NSArray&lt;OAITargetingSpecSHOPPINGRETARGETING&gt;***](OAITargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**tARGETINGSTRATEGY** | **NSArray&lt;NSString*&gt;*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# TargetingSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGE_BUCKET** | Pointer to **[]string** | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. | [optional] 
**APPTYPE** | Pointer to **[]string** | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. | [optional] 
**AUDIENCE_EXCLUDE** | Pointer to **[]string** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. | [optional] 
**AUDIENCE_INCLUDE** | Pointer to **[]string** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. | [optional] 
**GENDER** | Pointer to **[]string** | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. | [optional] 
**GEO** | Pointer to **[]string** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. | [optional] 
**INTEREST** | Pointer to **[]string** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. | [optional] 
**LOCALE** | Pointer to **[]string** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. | [optional] 
**LOCATION** | Pointer to **[]string** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. | [optional] 
**SHOPPING_RETARGETING** | Pointer to [**[]TargetingSpecSHOPPINGRETARGETING**](TargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**TARGETING_STRATEGY** | Pointer to **[]string** |  | [optional] 

## Methods

### NewTargetingSpec

`func NewTargetingSpec() *TargetingSpec`

NewTargetingSpec instantiates a new TargetingSpec object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingSpecWithDefaults

`func NewTargetingSpecWithDefaults() *TargetingSpec`

NewTargetingSpecWithDefaults instantiates a new TargetingSpec object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAGE_BUCKET

`func (o *TargetingSpec) GetAGE_BUCKET() []string`

GetAGE_BUCKET returns the AGE_BUCKET field if non-nil, zero value otherwise.

### GetAGE_BUCKETOk

`func (o *TargetingSpec) GetAGE_BUCKETOk() (*[]string, bool)`

GetAGE_BUCKETOk returns a tuple with the AGE_BUCKET field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAGE_BUCKET

`func (o *TargetingSpec) SetAGE_BUCKET(v []string)`

SetAGE_BUCKET sets AGE_BUCKET field to given value.

### HasAGE_BUCKET

`func (o *TargetingSpec) HasAGE_BUCKET() bool`

HasAGE_BUCKET returns a boolean if a field has been set.

### SetAGE_BUCKETNil

`func (o *TargetingSpec) SetAGE_BUCKETNil(b bool)`

 SetAGE_BUCKETNil sets the value for AGE_BUCKET to be an explicit nil

### UnsetAGE_BUCKET
`func (o *TargetingSpec) UnsetAGE_BUCKET()`

UnsetAGE_BUCKET ensures that no value is present for AGE_BUCKET, not even an explicit nil
### GetAPPTYPE

`func (o *TargetingSpec) GetAPPTYPE() []string`

GetAPPTYPE returns the APPTYPE field if non-nil, zero value otherwise.

### GetAPPTYPEOk

`func (o *TargetingSpec) GetAPPTYPEOk() (*[]string, bool)`

GetAPPTYPEOk returns a tuple with the APPTYPE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAPPTYPE

`func (o *TargetingSpec) SetAPPTYPE(v []string)`

SetAPPTYPE sets APPTYPE field to given value.

### HasAPPTYPE

`func (o *TargetingSpec) HasAPPTYPE() bool`

HasAPPTYPE returns a boolean if a field has been set.

### SetAPPTYPENil

`func (o *TargetingSpec) SetAPPTYPENil(b bool)`

 SetAPPTYPENil sets the value for APPTYPE to be an explicit nil

### UnsetAPPTYPE
`func (o *TargetingSpec) UnsetAPPTYPE()`

UnsetAPPTYPE ensures that no value is present for APPTYPE, not even an explicit nil
### GetAUDIENCE_EXCLUDE

`func (o *TargetingSpec) GetAUDIENCE_EXCLUDE() []string`

GetAUDIENCE_EXCLUDE returns the AUDIENCE_EXCLUDE field if non-nil, zero value otherwise.

### GetAUDIENCE_EXCLUDEOk

`func (o *TargetingSpec) GetAUDIENCE_EXCLUDEOk() (*[]string, bool)`

GetAUDIENCE_EXCLUDEOk returns a tuple with the AUDIENCE_EXCLUDE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAUDIENCE_EXCLUDE

`func (o *TargetingSpec) SetAUDIENCE_EXCLUDE(v []string)`

SetAUDIENCE_EXCLUDE sets AUDIENCE_EXCLUDE field to given value.

### HasAUDIENCE_EXCLUDE

`func (o *TargetingSpec) HasAUDIENCE_EXCLUDE() bool`

HasAUDIENCE_EXCLUDE returns a boolean if a field has been set.

### SetAUDIENCE_EXCLUDENil

`func (o *TargetingSpec) SetAUDIENCE_EXCLUDENil(b bool)`

 SetAUDIENCE_EXCLUDENil sets the value for AUDIENCE_EXCLUDE to be an explicit nil

### UnsetAUDIENCE_EXCLUDE
`func (o *TargetingSpec) UnsetAUDIENCE_EXCLUDE()`

UnsetAUDIENCE_EXCLUDE ensures that no value is present for AUDIENCE_EXCLUDE, not even an explicit nil
### GetAUDIENCE_INCLUDE

`func (o *TargetingSpec) GetAUDIENCE_INCLUDE() []string`

GetAUDIENCE_INCLUDE returns the AUDIENCE_INCLUDE field if non-nil, zero value otherwise.

### GetAUDIENCE_INCLUDEOk

`func (o *TargetingSpec) GetAUDIENCE_INCLUDEOk() (*[]string, bool)`

GetAUDIENCE_INCLUDEOk returns a tuple with the AUDIENCE_INCLUDE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAUDIENCE_INCLUDE

`func (o *TargetingSpec) SetAUDIENCE_INCLUDE(v []string)`

SetAUDIENCE_INCLUDE sets AUDIENCE_INCLUDE field to given value.

### HasAUDIENCE_INCLUDE

`func (o *TargetingSpec) HasAUDIENCE_INCLUDE() bool`

HasAUDIENCE_INCLUDE returns a boolean if a field has been set.

### SetAUDIENCE_INCLUDENil

`func (o *TargetingSpec) SetAUDIENCE_INCLUDENil(b bool)`

 SetAUDIENCE_INCLUDENil sets the value for AUDIENCE_INCLUDE to be an explicit nil

### UnsetAUDIENCE_INCLUDE
`func (o *TargetingSpec) UnsetAUDIENCE_INCLUDE()`

UnsetAUDIENCE_INCLUDE ensures that no value is present for AUDIENCE_INCLUDE, not even an explicit nil
### GetGENDER

`func (o *TargetingSpec) GetGENDER() []string`

GetGENDER returns the GENDER field if non-nil, zero value otherwise.

### GetGENDEROk

`func (o *TargetingSpec) GetGENDEROk() (*[]string, bool)`

GetGENDEROk returns a tuple with the GENDER field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGENDER

`func (o *TargetingSpec) SetGENDER(v []string)`

SetGENDER sets GENDER field to given value.

### HasGENDER

`func (o *TargetingSpec) HasGENDER() bool`

HasGENDER returns a boolean if a field has been set.

### SetGENDERNil

`func (o *TargetingSpec) SetGENDERNil(b bool)`

 SetGENDERNil sets the value for GENDER to be an explicit nil

### UnsetGENDER
`func (o *TargetingSpec) UnsetGENDER()`

UnsetGENDER ensures that no value is present for GENDER, not even an explicit nil
### GetGEO

`func (o *TargetingSpec) GetGEO() []string`

GetGEO returns the GEO field if non-nil, zero value otherwise.

### GetGEOOk

`func (o *TargetingSpec) GetGEOOk() (*[]string, bool)`

GetGEOOk returns a tuple with the GEO field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGEO

`func (o *TargetingSpec) SetGEO(v []string)`

SetGEO sets GEO field to given value.

### HasGEO

`func (o *TargetingSpec) HasGEO() bool`

HasGEO returns a boolean if a field has been set.

### SetGEONil

`func (o *TargetingSpec) SetGEONil(b bool)`

 SetGEONil sets the value for GEO to be an explicit nil

### UnsetGEO
`func (o *TargetingSpec) UnsetGEO()`

UnsetGEO ensures that no value is present for GEO, not even an explicit nil
### GetINTEREST

`func (o *TargetingSpec) GetINTEREST() []string`

GetINTEREST returns the INTEREST field if non-nil, zero value otherwise.

### GetINTERESTOk

`func (o *TargetingSpec) GetINTERESTOk() (*[]string, bool)`

GetINTERESTOk returns a tuple with the INTEREST field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetINTEREST

`func (o *TargetingSpec) SetINTEREST(v []string)`

SetINTEREST sets INTEREST field to given value.

### HasINTEREST

`func (o *TargetingSpec) HasINTEREST() bool`

HasINTEREST returns a boolean if a field has been set.

### GetLOCALE

`func (o *TargetingSpec) GetLOCALE() []string`

GetLOCALE returns the LOCALE field if non-nil, zero value otherwise.

### GetLOCALEOk

`func (o *TargetingSpec) GetLOCALEOk() (*[]string, bool)`

GetLOCALEOk returns a tuple with the LOCALE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLOCALE

`func (o *TargetingSpec) SetLOCALE(v []string)`

SetLOCALE sets LOCALE field to given value.

### HasLOCALE

`func (o *TargetingSpec) HasLOCALE() bool`

HasLOCALE returns a boolean if a field has been set.

### SetLOCALENil

`func (o *TargetingSpec) SetLOCALENil(b bool)`

 SetLOCALENil sets the value for LOCALE to be an explicit nil

### UnsetLOCALE
`func (o *TargetingSpec) UnsetLOCALE()`

UnsetLOCALE ensures that no value is present for LOCALE, not even an explicit nil
### GetLOCATION

`func (o *TargetingSpec) GetLOCATION() []string`

GetLOCATION returns the LOCATION field if non-nil, zero value otherwise.

### GetLOCATIONOk

`func (o *TargetingSpec) GetLOCATIONOk() (*[]string, bool)`

GetLOCATIONOk returns a tuple with the LOCATION field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLOCATION

`func (o *TargetingSpec) SetLOCATION(v []string)`

SetLOCATION sets LOCATION field to given value.

### HasLOCATION

`func (o *TargetingSpec) HasLOCATION() bool`

HasLOCATION returns a boolean if a field has been set.

### SetLOCATIONNil

`func (o *TargetingSpec) SetLOCATIONNil(b bool)`

 SetLOCATIONNil sets the value for LOCATION to be an explicit nil

### UnsetLOCATION
`func (o *TargetingSpec) UnsetLOCATION()`

UnsetLOCATION ensures that no value is present for LOCATION, not even an explicit nil
### GetSHOPPING_RETARGETING

`func (o *TargetingSpec) GetSHOPPING_RETARGETING() []TargetingSpecSHOPPINGRETARGETING`

GetSHOPPING_RETARGETING returns the SHOPPING_RETARGETING field if non-nil, zero value otherwise.

### GetSHOPPING_RETARGETINGOk

`func (o *TargetingSpec) GetSHOPPING_RETARGETINGOk() (*[]TargetingSpecSHOPPINGRETARGETING, bool)`

GetSHOPPING_RETARGETINGOk returns a tuple with the SHOPPING_RETARGETING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSHOPPING_RETARGETING

`func (o *TargetingSpec) SetSHOPPING_RETARGETING(v []TargetingSpecSHOPPINGRETARGETING)`

SetSHOPPING_RETARGETING sets SHOPPING_RETARGETING field to given value.

### HasSHOPPING_RETARGETING

`func (o *TargetingSpec) HasSHOPPING_RETARGETING() bool`

HasSHOPPING_RETARGETING returns a boolean if a field has been set.

### SetSHOPPING_RETARGETINGNil

`func (o *TargetingSpec) SetSHOPPING_RETARGETINGNil(b bool)`

 SetSHOPPING_RETARGETINGNil sets the value for SHOPPING_RETARGETING to be an explicit nil

### UnsetSHOPPING_RETARGETING
`func (o *TargetingSpec) UnsetSHOPPING_RETARGETING()`

UnsetSHOPPING_RETARGETING ensures that no value is present for SHOPPING_RETARGETING, not even an explicit nil
### GetTARGETING_STRATEGY

`func (o *TargetingSpec) GetTARGETING_STRATEGY() []string`

GetTARGETING_STRATEGY returns the TARGETING_STRATEGY field if non-nil, zero value otherwise.

### GetTARGETING_STRATEGYOk

`func (o *TargetingSpec) GetTARGETING_STRATEGYOk() (*[]string, bool)`

GetTARGETING_STRATEGYOk returns a tuple with the TARGETING_STRATEGY field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTARGETING_STRATEGY

`func (o *TargetingSpec) SetTARGETING_STRATEGY(v []string)`

SetTARGETING_STRATEGY sets TARGETING_STRATEGY field to given value.

### HasTARGETING_STRATEGY

`func (o *TargetingSpec) HasTARGETING_STRATEGY() bool`

HasTARGETING_STRATEGY returns a boolean if a field has been set.

### SetTARGETING_STRATEGYNil

`func (o *TargetingSpec) SetTARGETING_STRATEGYNil(b bool)`

 SetTARGETING_STRATEGYNil sets the value for TARGETING_STRATEGY to be an explicit nil

### UnsetTARGETING_STRATEGY
`func (o *TargetingSpec) UnsetTARGETING_STRATEGY()`

UnsetTARGETING_STRATEGY ensures that no value is present for TARGETING_STRATEGY, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



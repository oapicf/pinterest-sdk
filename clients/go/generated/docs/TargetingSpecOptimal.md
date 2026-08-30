# TargetingSpecOptimal

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGE_BUCKET** | Pointer to [**[]TargetingSpecAgeBucket**](TargetingSpecAgeBucket.md) | **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. | [optional] 
**APPTYPE** | Pointer to [**[]TargetingSpecAppType**](TargetingSpecAppType.md) | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. | [optional] 
**AUDIENCE_EXCLUDE** | Pointer to **[]string** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. | [optional] 
**AUDIENCE_INCLUDE** | Pointer to **[]string** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. | [optional] 
**GENDER** | Pointer to [**[]TargetingSpecGender**](TargetingSpecGender.md) | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. | [optional] 
**GEO** | Pointer to **[]string** | Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: &#x60;US-CA&#x60; is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: &#x60;94103&#x60; is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &#x60;US-CA&#x60; or a more granular postal code within that regon, such as &#x60;94103&#x60;.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the &#x60;region_codes&#x60; key and a postal code value with the &#x60;postal_codes&#x60; key. Examples:  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;region_codes\&quot;: [\&quot;US-CA\&quot;] } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;postal_codes\&quot;: [\&quot;94103\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60;.  If you do not specifiy a &#x60;GEO&#x60; code, only &#x60;LOCATION&#x60; values will be targeted (See &#x60;LOCATION&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). | [optional] 
**GEO_EXCLUDE** | Pointer to **[]string** | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See &#x60;GEO&#x60; parameter in this targeting spec for rules, syntax, and other information. | [optional] 
**INTEREST** | Pointer to **[]string** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. | [optional] 
**LOCALE** | Pointer to **[]string** | 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. | [optional] 
**LOCATION** | Pointer to **[]string** | Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the &#x60;country_codes&#x60; key and metro code values with &#x60;metro_codes&#x60; key. Example:  &#x60;&#x60;&#x60; \&quot;location\&quot;: {   \&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],   \&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60; code.  If you do not specify a &#x60;LOCATION&#x60; code, only &#x60;GEO&#x60; values will be targeted (See &#x60;GEO&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). | [optional] 
**LOCATION_EXCLUDE** | Pointer to **[]string** | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See &#x60;LOCATION&#x60; parameter in this targeting spec for rules, syntax, and other information. | [optional] 
**MAXIMUM_AGE** | Pointer to **string** | Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. | [optional] 
**MINIMUM_AGE** | Pointer to **string** | Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. | [optional] 
**SHOPPING_RETARGETING** | Pointer to [**[]TargetingSpecShoppingRetargeting**](TargetingSpecShoppingRetargeting.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**TARGETING_STRATEGY** | Pointer to [**[]TargetingStrategy**](TargetingStrategy.md) |  | [optional] 

## Methods

### NewTargetingSpecOptimal

`func NewTargetingSpecOptimal() *TargetingSpecOptimal`

NewTargetingSpecOptimal instantiates a new TargetingSpecOptimal object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingSpecOptimalWithDefaults

`func NewTargetingSpecOptimalWithDefaults() *TargetingSpecOptimal`

NewTargetingSpecOptimalWithDefaults instantiates a new TargetingSpecOptimal object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAGE_BUCKET

`func (o *TargetingSpecOptimal) GetAGE_BUCKET() []TargetingSpecAgeBucket`

GetAGE_BUCKET returns the AGE_BUCKET field if non-nil, zero value otherwise.

### GetAGE_BUCKETOk

`func (o *TargetingSpecOptimal) GetAGE_BUCKETOk() (*[]TargetingSpecAgeBucket, bool)`

GetAGE_BUCKETOk returns a tuple with the AGE_BUCKET field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAGE_BUCKET

`func (o *TargetingSpecOptimal) SetAGE_BUCKET(v []TargetingSpecAgeBucket)`

SetAGE_BUCKET sets AGE_BUCKET field to given value.

### HasAGE_BUCKET

`func (o *TargetingSpecOptimal) HasAGE_BUCKET() bool`

HasAGE_BUCKET returns a boolean if a field has been set.

### SetAGE_BUCKETNil

`func (o *TargetingSpecOptimal) SetAGE_BUCKETNil(b bool)`

 SetAGE_BUCKETNil sets the value for AGE_BUCKET to be an explicit nil

### UnsetAGE_BUCKET
`func (o *TargetingSpecOptimal) UnsetAGE_BUCKET()`

UnsetAGE_BUCKET ensures that no value is present for AGE_BUCKET, not even an explicit nil
### GetAPPTYPE

`func (o *TargetingSpecOptimal) GetAPPTYPE() []TargetingSpecAppType`

GetAPPTYPE returns the APPTYPE field if non-nil, zero value otherwise.

### GetAPPTYPEOk

`func (o *TargetingSpecOptimal) GetAPPTYPEOk() (*[]TargetingSpecAppType, bool)`

GetAPPTYPEOk returns a tuple with the APPTYPE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAPPTYPE

`func (o *TargetingSpecOptimal) SetAPPTYPE(v []TargetingSpecAppType)`

SetAPPTYPE sets APPTYPE field to given value.

### HasAPPTYPE

`func (o *TargetingSpecOptimal) HasAPPTYPE() bool`

HasAPPTYPE returns a boolean if a field has been set.

### SetAPPTYPENil

`func (o *TargetingSpecOptimal) SetAPPTYPENil(b bool)`

 SetAPPTYPENil sets the value for APPTYPE to be an explicit nil

### UnsetAPPTYPE
`func (o *TargetingSpecOptimal) UnsetAPPTYPE()`

UnsetAPPTYPE ensures that no value is present for APPTYPE, not even an explicit nil
### GetAUDIENCE_EXCLUDE

`func (o *TargetingSpecOptimal) GetAUDIENCE_EXCLUDE() []string`

GetAUDIENCE_EXCLUDE returns the AUDIENCE_EXCLUDE field if non-nil, zero value otherwise.

### GetAUDIENCE_EXCLUDEOk

`func (o *TargetingSpecOptimal) GetAUDIENCE_EXCLUDEOk() (*[]string, bool)`

GetAUDIENCE_EXCLUDEOk returns a tuple with the AUDIENCE_EXCLUDE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAUDIENCE_EXCLUDE

`func (o *TargetingSpecOptimal) SetAUDIENCE_EXCLUDE(v []string)`

SetAUDIENCE_EXCLUDE sets AUDIENCE_EXCLUDE field to given value.

### HasAUDIENCE_EXCLUDE

`func (o *TargetingSpecOptimal) HasAUDIENCE_EXCLUDE() bool`

HasAUDIENCE_EXCLUDE returns a boolean if a field has been set.

### SetAUDIENCE_EXCLUDENil

`func (o *TargetingSpecOptimal) SetAUDIENCE_EXCLUDENil(b bool)`

 SetAUDIENCE_EXCLUDENil sets the value for AUDIENCE_EXCLUDE to be an explicit nil

### UnsetAUDIENCE_EXCLUDE
`func (o *TargetingSpecOptimal) UnsetAUDIENCE_EXCLUDE()`

UnsetAUDIENCE_EXCLUDE ensures that no value is present for AUDIENCE_EXCLUDE, not even an explicit nil
### GetAUDIENCE_INCLUDE

`func (o *TargetingSpecOptimal) GetAUDIENCE_INCLUDE() []string`

GetAUDIENCE_INCLUDE returns the AUDIENCE_INCLUDE field if non-nil, zero value otherwise.

### GetAUDIENCE_INCLUDEOk

`func (o *TargetingSpecOptimal) GetAUDIENCE_INCLUDEOk() (*[]string, bool)`

GetAUDIENCE_INCLUDEOk returns a tuple with the AUDIENCE_INCLUDE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAUDIENCE_INCLUDE

`func (o *TargetingSpecOptimal) SetAUDIENCE_INCLUDE(v []string)`

SetAUDIENCE_INCLUDE sets AUDIENCE_INCLUDE field to given value.

### HasAUDIENCE_INCLUDE

`func (o *TargetingSpecOptimal) HasAUDIENCE_INCLUDE() bool`

HasAUDIENCE_INCLUDE returns a boolean if a field has been set.

### SetAUDIENCE_INCLUDENil

`func (o *TargetingSpecOptimal) SetAUDIENCE_INCLUDENil(b bool)`

 SetAUDIENCE_INCLUDENil sets the value for AUDIENCE_INCLUDE to be an explicit nil

### UnsetAUDIENCE_INCLUDE
`func (o *TargetingSpecOptimal) UnsetAUDIENCE_INCLUDE()`

UnsetAUDIENCE_INCLUDE ensures that no value is present for AUDIENCE_INCLUDE, not even an explicit nil
### GetGENDER

`func (o *TargetingSpecOptimal) GetGENDER() []TargetingSpecGender`

GetGENDER returns the GENDER field if non-nil, zero value otherwise.

### GetGENDEROk

`func (o *TargetingSpecOptimal) GetGENDEROk() (*[]TargetingSpecGender, bool)`

GetGENDEROk returns a tuple with the GENDER field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGENDER

`func (o *TargetingSpecOptimal) SetGENDER(v []TargetingSpecGender)`

SetGENDER sets GENDER field to given value.

### HasGENDER

`func (o *TargetingSpecOptimal) HasGENDER() bool`

HasGENDER returns a boolean if a field has been set.

### SetGENDERNil

`func (o *TargetingSpecOptimal) SetGENDERNil(b bool)`

 SetGENDERNil sets the value for GENDER to be an explicit nil

### UnsetGENDER
`func (o *TargetingSpecOptimal) UnsetGENDER()`

UnsetGENDER ensures that no value is present for GENDER, not even an explicit nil
### GetGEO

`func (o *TargetingSpecOptimal) GetGEO() []string`

GetGEO returns the GEO field if non-nil, zero value otherwise.

### GetGEOOk

`func (o *TargetingSpecOptimal) GetGEOOk() (*[]string, bool)`

GetGEOOk returns a tuple with the GEO field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGEO

`func (o *TargetingSpecOptimal) SetGEO(v []string)`

SetGEO sets GEO field to given value.

### HasGEO

`func (o *TargetingSpecOptimal) HasGEO() bool`

HasGEO returns a boolean if a field has been set.

### SetGEONil

`func (o *TargetingSpecOptimal) SetGEONil(b bool)`

 SetGEONil sets the value for GEO to be an explicit nil

### UnsetGEO
`func (o *TargetingSpecOptimal) UnsetGEO()`

UnsetGEO ensures that no value is present for GEO, not even an explicit nil
### GetGEO_EXCLUDE

`func (o *TargetingSpecOptimal) GetGEO_EXCLUDE() []string`

GetGEO_EXCLUDE returns the GEO_EXCLUDE field if non-nil, zero value otherwise.

### GetGEO_EXCLUDEOk

`func (o *TargetingSpecOptimal) GetGEO_EXCLUDEOk() (*[]string, bool)`

GetGEO_EXCLUDEOk returns a tuple with the GEO_EXCLUDE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGEO_EXCLUDE

`func (o *TargetingSpecOptimal) SetGEO_EXCLUDE(v []string)`

SetGEO_EXCLUDE sets GEO_EXCLUDE field to given value.

### HasGEO_EXCLUDE

`func (o *TargetingSpecOptimal) HasGEO_EXCLUDE() bool`

HasGEO_EXCLUDE returns a boolean if a field has been set.

### GetINTEREST

`func (o *TargetingSpecOptimal) GetINTEREST() []string`

GetINTEREST returns the INTEREST field if non-nil, zero value otherwise.

### GetINTERESTOk

`func (o *TargetingSpecOptimal) GetINTERESTOk() (*[]string, bool)`

GetINTERESTOk returns a tuple with the INTEREST field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetINTEREST

`func (o *TargetingSpecOptimal) SetINTEREST(v []string)`

SetINTEREST sets INTEREST field to given value.

### HasINTEREST

`func (o *TargetingSpecOptimal) HasINTEREST() bool`

HasINTEREST returns a boolean if a field has been set.

### GetLOCALE

`func (o *TargetingSpecOptimal) GetLOCALE() []string`

GetLOCALE returns the LOCALE field if non-nil, zero value otherwise.

### GetLOCALEOk

`func (o *TargetingSpecOptimal) GetLOCALEOk() (*[]string, bool)`

GetLOCALEOk returns a tuple with the LOCALE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLOCALE

`func (o *TargetingSpecOptimal) SetLOCALE(v []string)`

SetLOCALE sets LOCALE field to given value.

### HasLOCALE

`func (o *TargetingSpecOptimal) HasLOCALE() bool`

HasLOCALE returns a boolean if a field has been set.

### SetLOCALENil

`func (o *TargetingSpecOptimal) SetLOCALENil(b bool)`

 SetLOCALENil sets the value for LOCALE to be an explicit nil

### UnsetLOCALE
`func (o *TargetingSpecOptimal) UnsetLOCALE()`

UnsetLOCALE ensures that no value is present for LOCALE, not even an explicit nil
### GetLOCATION

`func (o *TargetingSpecOptimal) GetLOCATION() []string`

GetLOCATION returns the LOCATION field if non-nil, zero value otherwise.

### GetLOCATIONOk

`func (o *TargetingSpecOptimal) GetLOCATIONOk() (*[]string, bool)`

GetLOCATIONOk returns a tuple with the LOCATION field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLOCATION

`func (o *TargetingSpecOptimal) SetLOCATION(v []string)`

SetLOCATION sets LOCATION field to given value.

### HasLOCATION

`func (o *TargetingSpecOptimal) HasLOCATION() bool`

HasLOCATION returns a boolean if a field has been set.

### SetLOCATIONNil

`func (o *TargetingSpecOptimal) SetLOCATIONNil(b bool)`

 SetLOCATIONNil sets the value for LOCATION to be an explicit nil

### UnsetLOCATION
`func (o *TargetingSpecOptimal) UnsetLOCATION()`

UnsetLOCATION ensures that no value is present for LOCATION, not even an explicit nil
### GetLOCATION_EXCLUDE

`func (o *TargetingSpecOptimal) GetLOCATION_EXCLUDE() []string`

GetLOCATION_EXCLUDE returns the LOCATION_EXCLUDE field if non-nil, zero value otherwise.

### GetLOCATION_EXCLUDEOk

`func (o *TargetingSpecOptimal) GetLOCATION_EXCLUDEOk() (*[]string, bool)`

GetLOCATION_EXCLUDEOk returns a tuple with the LOCATION_EXCLUDE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLOCATION_EXCLUDE

`func (o *TargetingSpecOptimal) SetLOCATION_EXCLUDE(v []string)`

SetLOCATION_EXCLUDE sets LOCATION_EXCLUDE field to given value.

### HasLOCATION_EXCLUDE

`func (o *TargetingSpecOptimal) HasLOCATION_EXCLUDE() bool`

HasLOCATION_EXCLUDE returns a boolean if a field has been set.

### GetMAXIMUM_AGE

`func (o *TargetingSpecOptimal) GetMAXIMUM_AGE() string`

GetMAXIMUM_AGE returns the MAXIMUM_AGE field if non-nil, zero value otherwise.

### GetMAXIMUM_AGEOk

`func (o *TargetingSpecOptimal) GetMAXIMUM_AGEOk() (*string, bool)`

GetMAXIMUM_AGEOk returns a tuple with the MAXIMUM_AGE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMAXIMUM_AGE

`func (o *TargetingSpecOptimal) SetMAXIMUM_AGE(v string)`

SetMAXIMUM_AGE sets MAXIMUM_AGE field to given value.

### HasMAXIMUM_AGE

`func (o *TargetingSpecOptimal) HasMAXIMUM_AGE() bool`

HasMAXIMUM_AGE returns a boolean if a field has been set.

### GetMINIMUM_AGE

`func (o *TargetingSpecOptimal) GetMINIMUM_AGE() string`

GetMINIMUM_AGE returns the MINIMUM_AGE field if non-nil, zero value otherwise.

### GetMINIMUM_AGEOk

`func (o *TargetingSpecOptimal) GetMINIMUM_AGEOk() (*string, bool)`

GetMINIMUM_AGEOk returns a tuple with the MINIMUM_AGE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMINIMUM_AGE

`func (o *TargetingSpecOptimal) SetMINIMUM_AGE(v string)`

SetMINIMUM_AGE sets MINIMUM_AGE field to given value.

### HasMINIMUM_AGE

`func (o *TargetingSpecOptimal) HasMINIMUM_AGE() bool`

HasMINIMUM_AGE returns a boolean if a field has been set.

### GetSHOPPING_RETARGETING

`func (o *TargetingSpecOptimal) GetSHOPPING_RETARGETING() []TargetingSpecShoppingRetargeting`

GetSHOPPING_RETARGETING returns the SHOPPING_RETARGETING field if non-nil, zero value otherwise.

### GetSHOPPING_RETARGETINGOk

`func (o *TargetingSpecOptimal) GetSHOPPING_RETARGETINGOk() (*[]TargetingSpecShoppingRetargeting, bool)`

GetSHOPPING_RETARGETINGOk returns a tuple with the SHOPPING_RETARGETING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSHOPPING_RETARGETING

`func (o *TargetingSpecOptimal) SetSHOPPING_RETARGETING(v []TargetingSpecShoppingRetargeting)`

SetSHOPPING_RETARGETING sets SHOPPING_RETARGETING field to given value.

### HasSHOPPING_RETARGETING

`func (o *TargetingSpecOptimal) HasSHOPPING_RETARGETING() bool`

HasSHOPPING_RETARGETING returns a boolean if a field has been set.

### SetSHOPPING_RETARGETINGNil

`func (o *TargetingSpecOptimal) SetSHOPPING_RETARGETINGNil(b bool)`

 SetSHOPPING_RETARGETINGNil sets the value for SHOPPING_RETARGETING to be an explicit nil

### UnsetSHOPPING_RETARGETING
`func (o *TargetingSpecOptimal) UnsetSHOPPING_RETARGETING()`

UnsetSHOPPING_RETARGETING ensures that no value is present for SHOPPING_RETARGETING, not even an explicit nil
### GetTARGETING_STRATEGY

`func (o *TargetingSpecOptimal) GetTARGETING_STRATEGY() []TargetingStrategy`

GetTARGETING_STRATEGY returns the TARGETING_STRATEGY field if non-nil, zero value otherwise.

### GetTARGETING_STRATEGYOk

`func (o *TargetingSpecOptimal) GetTARGETING_STRATEGYOk() (*[]TargetingStrategy, bool)`

GetTARGETING_STRATEGYOk returns a tuple with the TARGETING_STRATEGY field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTARGETING_STRATEGY

`func (o *TargetingSpecOptimal) SetTARGETING_STRATEGY(v []TargetingStrategy)`

SetTARGETING_STRATEGY sets TARGETING_STRATEGY field to given value.

### HasTARGETING_STRATEGY

`func (o *TargetingSpecOptimal) HasTARGETING_STRATEGY() bool`

HasTARGETING_STRATEGY returns a boolean if a field has been set.

### SetTARGETING_STRATEGYNil

`func (o *TargetingSpecOptimal) SetTARGETING_STRATEGYNil(b bool)`

 SetTARGETING_STRATEGYNil sets the value for TARGETING_STRATEGY to be an explicit nil

### UnsetTARGETING_STRATEGY
`func (o *TargetingSpecOptimal) UnsetTARGETING_STRATEGY()`

UnsetTARGETING_STRATEGY ensures that no value is present for TARGETING_STRATEGY, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



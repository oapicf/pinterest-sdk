
# Table `TargetingSpec`
(mapped from: TargetingSpec)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**AGE_BUCKET** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecAgeBucket&gt;**](TargetingSpecAgeBucket.md) | **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. |  [optional]
**APPTYPE** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecAppType&gt;**](TargetingSpecAppType.md) | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. |  [optional]
**AUDIENCE_EXCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. |  [optional]
**AUDIENCE_INCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. |  [optional]
**GENDER** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecGender&gt;**](TargetingSpecGender.md) | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. |  [optional]
**GEO** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). |  [optional]
**INTEREST** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. |  [optional]
**LOCALE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. |  [optional]
**LOCATION** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). |  [optional]
**MAXIMUM_AGE** | MAXIMUM_AGE | text |  | **kotlin.String** | Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. |  [optional]
**MINIMUM_AGE** | MINIMUM_AGE | text |  | **kotlin.String** | Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. |  [optional]
**SHOPPING_RETARGETING** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecShoppingRetargeting&gt;**](TargetingSpecShoppingRetargeting.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting |  [optional]
**TARGETING_STRATEGY** | `One-To-Many` | `----` | `----`  | [**TARGETING_STRATEGY**](#kotlin.Array&lt;TARGETINGSTRATEGY&gt;) |  |  [optional]


# **Table `TargetingSpecTargetingSpecAgeBucket`**
(mapped from: TargetingSpecTargetingSpecAgeBucket)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
targetingSpecAgeBucket | targetingSpecAgeBucket | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecTargetingSpecAppType`**
(mapped from: TargetingSpecTargetingSpecAppType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
targetingSpecAppType | targetingSpecAppType | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecAUDIENCEEXCLUDE`**
(mapped from: TargetingSpecAUDIENCEEXCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
aUDIENCEEXCLUDE | aUDIENCEEXCLUDE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecAUDIENCEINCLUDE`**
(mapped from: TargetingSpecAUDIENCEINCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
aUDIENCEINCLUDE | aUDIENCEINCLUDE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecTargetingSpecGender`**
(mapped from: TargetingSpecTargetingSpecGender)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
targetingSpecGender | targetingSpecGender | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecGEO`**
(mapped from: TargetingSpecGEO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
gEO | gEO | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecINTEREST`**
(mapped from: TargetingSpecINTEREST)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
iNTEREST | iNTEREST | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecLOCALE`**
(mapped from: TargetingSpecLOCALE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
lOCALE | lOCALE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecLOCATION`**
(mapped from: TargetingSpecLOCATION)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
lOCATION | lOCATION | text | | kotlin.String | Foreign Key | *many*





# **Table `TargetingSpecTargetingSpecShoppingRetargeting`**
(mapped from: TargetingSpecTargetingSpecShoppingRetargeting)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
targetingSpecShoppingRetargeting | targetingSpecShoppingRetargeting | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecTARGETINGSTRATEGY`**
(mapped from: TargetingSpecTARGETINGSTRATEGY)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
tARGETINGSTRATEGY | tARGETINGSTRATEGY | text | | kotlin.String | Foreign Key | *many*




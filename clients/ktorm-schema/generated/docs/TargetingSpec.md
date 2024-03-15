
# Table `TargetingSpec`
(mapped from: TargetingSpec)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**AGE_BUCKET** | `One-To-Many` | `----` | `----`  | [**AGE_BUCKET**](#kotlin.Array&lt;AGEBUCKET&gt;) | Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. |  [optional]
**APPTYPE** | `One-To-Many` | `----` | `----`  | [**APPTYPE**](#kotlin.Array&lt;APPTYPE&gt;) | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. |  [optional]
**AUDIENCE_EXCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. |  [optional]
**auDIENCEINCLUDEQuote** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. |  [optional]
**GENDER** | `One-To-Many` | `----` | `----`  | [**GENDER**](#kotlin.Array&lt;GENDER&gt;) | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. |  [optional]
**GEO** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. |  [optional]
**INTEREST** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. |  [optional]
**LOCALE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. |  [optional]
**LOCATION** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. |  [optional]
**SHOPPING_RETARGETING** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecSHOPPINGRETARGETING&gt;**](TargetingSpecSHOPPINGRETARGETING.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting |  [optional]
**TARGETING_STRATEGY** | `One-To-Many` | `----` | `----`  | [**TARGETING_STRATEGY**](#kotlin.Array&lt;TARGETINGSTRATEGY&gt;) |  |  [optional]


# **Table `TargetingSpecAGEBUCKET`**
(mapped from: TargetingSpecAGEBUCKET)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
aGEBUCKET | aGEBUCKET | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecAPPTYPE`**
(mapped from: TargetingSpecAPPTYPE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
aPPTYPE | aPPTYPE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecAUDIENCEEXCLUDE`**
(mapped from: TargetingSpecAUDIENCEEXCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
aUDIENCEEXCLUDE | aUDIENCEEXCLUDE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecAuDIENCEINCLUDEQuote`**
(mapped from: TargetingSpecAuDIENCEINCLUDEQuote)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
auDIENCEINCLUDEQuote | auDIENCEINCLUDEQuote | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecGENDER`**
(mapped from: TargetingSpecGENDER)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
gENDER | gENDER | text | | kotlin.String | Foreign Key | *many*



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



# **Table `TargetingSpecTargetingSpecSHOPPINGRETARGETING`**
(mapped from: TargetingSpecTargetingSpecSHOPPINGRETARGETING)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
targetingSpecSHOPPINGRETARGETING | targetingSpecSHOPPINGRETARGETING | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecTARGETINGSTRATEGY`**
(mapped from: TargetingSpecTARGETINGSTRATEGY)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
tARGETINGSTRATEGY | tARGETINGSTRATEGY | text | | kotlin.String | Foreign Key | *many*




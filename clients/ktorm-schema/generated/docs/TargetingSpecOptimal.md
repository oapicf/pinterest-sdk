
# Table `TargetingSpecOptimal`
(mapped from: TargetingSpecOptimal)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**AGE_BUCKET** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecAgeBucket&gt;**](TargetingSpecAgeBucket.md) | **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. |  [optional]
**APPTYPE** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecAppType&gt;**](TargetingSpecAppType.md) | Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. |  [optional]
**AUDIENCE_EXCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. |  [optional]
**AUDIENCE_INCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. |  [optional]
**GENDER** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecGender&gt;**](TargetingSpecGender.md) | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. |  [optional]
**GEO** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: &#x60;US-CA&#x60; is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: &#x60;94103&#x60; is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &#x60;US-CA&#x60; or a more granular postal code within that regon, such as &#x60;94103&#x60;.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the &#x60;region_codes&#x60; key and a postal code value with the &#x60;postal_codes&#x60; key. Examples:  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;region_codes\&quot;: [\&quot;US-CA\&quot;] } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;postal_codes\&quot;: [\&quot;94103\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60;.  If you do not specifiy a &#x60;GEO&#x60; code, only &#x60;LOCATION&#x60; values will be targeted (See &#x60;LOCATION&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). |  [optional]
**GEO_EXCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See &#x60;GEO&#x60; parameter in this targeting spec for rules, syntax, and other information. |  [optional]
**INTEREST** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. |  [optional]
**LOCALE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. |  [optional]
**LOCATION** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the &#x60;country_codes&#x60; key and metro code values with &#x60;metro_codes&#x60; key. Example:  &#x60;&#x60;&#x60; \&quot;location\&quot;: {   \&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],   \&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60; code.  If you do not specify a &#x60;LOCATION&#x60; code, only &#x60;GEO&#x60; values will be targeted (See &#x60;GEO&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). |  [optional]
**LOCATION_EXCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See &#x60;LOCATION&#x60; parameter in this targeting spec for rules, syntax, and other information. |  [optional]
**MAXIMUM_AGE** | MAXIMUM_AGE | text |  | **kotlin.String** | Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. |  [optional]
**MINIMUM_AGE** | MINIMUM_AGE | text |  | **kotlin.String** | Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted. |  [optional]
**SHOPPING_RETARGETING** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecShoppingRetargeting&gt;**](TargetingSpecShoppingRetargeting.md) | Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting |  [optional]
**TARGETING_STRATEGY** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingStrategy&gt;**](TargetingStrategy.md) |  |  [optional]


# **Table `TargetingSpecOptimalTargetingSpecAgeBucket`**
(mapped from: TargetingSpecOptimalTargetingSpecAgeBucket)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
targetingSpecAgeBucket | targetingSpecAgeBucket | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecOptimalTargetingSpecAppType`**
(mapped from: TargetingSpecOptimalTargetingSpecAppType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
targetingSpecAppType | targetingSpecAppType | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecOptimalAUDIENCEEXCLUDE`**
(mapped from: TargetingSpecOptimalAUDIENCEEXCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
aUDIENCEEXCLUDE | aUDIENCEEXCLUDE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecOptimalAUDIENCEINCLUDE`**
(mapped from: TargetingSpecOptimalAUDIENCEINCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
aUDIENCEINCLUDE | aUDIENCEINCLUDE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecOptimalTargetingSpecGender`**
(mapped from: TargetingSpecOptimalTargetingSpecGender)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
targetingSpecGender | targetingSpecGender | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecOptimalGEO`**
(mapped from: TargetingSpecOptimalGEO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
gEO | gEO | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecOptimalGEOEXCLUDE`**
(mapped from: TargetingSpecOptimalGEOEXCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
gEOEXCLUDE | gEOEXCLUDE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecOptimalINTEREST`**
(mapped from: TargetingSpecOptimalINTEREST)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
iNTEREST | iNTEREST | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecOptimalLOCALE`**
(mapped from: TargetingSpecOptimalLOCALE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
lOCALE | lOCALE | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecOptimalLOCATION`**
(mapped from: TargetingSpecOptimalLOCATION)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
lOCATION | lOCATION | text | | kotlin.String | Foreign Key | *many*



# **Table `TargetingSpecOptimalLOCATIONEXCLUDE`**
(mapped from: TargetingSpecOptimalLOCATIONEXCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
lOCATIONEXCLUDE | lOCATIONEXCLUDE | text | | kotlin.String | Foreign Key | *many*





# **Table `TargetingSpecOptimalTargetingSpecShoppingRetargeting`**
(mapped from: TargetingSpecOptimalTargetingSpecShoppingRetargeting)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
targetingSpecShoppingRetargeting | targetingSpecShoppingRetargeting | long | | kotlin.Long | Foreign Key | *many*



# **Table `TargetingSpecOptimalTargetingStrategy`**
(mapped from: TargetingSpecOptimalTargetingStrategy)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOptimal | targetingSpecOptimal | long | | kotlin.Long | Primary Key | *one*
targetingStrategy | targetingStrategy | long | | kotlin.Long | Foreign Key | *many*




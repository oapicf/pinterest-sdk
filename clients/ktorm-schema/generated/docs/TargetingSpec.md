
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
**GEO** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Region codes or postal codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Region codes represent broader geographical areas. Example: &lt;code&gt;US-CA&lt;/code&gt; is the region code for California in the United States.&lt;br /&gt;&lt;br /&gt; Postal codes represent more granular, specific areas. Example: &lt;code&gt;94103&lt;/code&gt; is a postal code for a specifc area in San Francisco, California, U.S.A.&lt;br /&gt;&lt;br /&gt; For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &lt;code&gt;US-CA&lt;/code&gt; or a more granular postal code within that regon, such as &lt;code&gt;94103&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt; You can specify multiple region codes or postal codes in an array, depending on which method you choose.&lt;br /&gt;&lt;br /&gt; Precede a region code array with the &lt;code&gt;region_codes&lt;/code&gt; key and a postal code value with the &lt;code&gt;postal_codes&lt;/code&gt; key. Examples:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;region_codes\&quot;: [\&quot;US-CA\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;postal_codes\&quot;: [\&quot;94103\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt; If you do not specifiy a &lt;code&gt;GEO&lt;/code&gt; code, only &lt;code&gt;LOCATION&lt;/code&gt; values will be targeted (See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;. |  [optional]
**GEO_EXCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Region codes or postal codes to exclude from the targeting inclusion area.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information.&lt;br /&gt; |  [optional]
**INTEREST** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. |  [optional]
**LOCALE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. |  [optional]
**LOCATION** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Precede country code values with the &lt;code&gt;country_codes&lt;/code&gt; key and metro code values with &lt;code&gt;metro_codes&lt;/code&gt; key. Example:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;location\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt; code. &lt;br /&gt;&lt;br /&gt; If you do not specify a &lt;code&gt;LOCATION&lt;/code&gt; code, only &lt;code&gt;GEO&lt;/code&gt; values will be targeted (See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;. |  [optional]
**LOCATION_EXCLUDE** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information. |  [optional]
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



# **Table `TargetingSpecGEOEXCLUDE`**
(mapped from: TargetingSpecGEOEXCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
gEOEXCLUDE | gEOEXCLUDE | text | | kotlin.String | Foreign Key | *many*



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



# **Table `TargetingSpecLOCATIONEXCLUDE`**
(mapped from: TargetingSpecLOCATIONEXCLUDE)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpec | targetingSpec | long | | kotlin.Long | Primary Key | *one*
lOCATIONEXCLUDE | lOCATIONEXCLUDE | text | | kotlin.String | Foreign Key | *many*





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




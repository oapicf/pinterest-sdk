# pinterestsdk.model.bid_floor_request.BidFloorRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[bid_floor_specs](#bid_floor_specs)** | list, tuple,  | tuple,  |  | 
**[targeting_spec](#targeting_spec)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Ad group targeting specification defining the ad group target audience. For example, &#x27;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x27; | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# bid_floor_specs

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**billable_event** | [**ActionType**](ActionType.md) | [**ActionType**](ActionType.md) |  | 
**currency** | [**Currency**](Currency.md) | [**Currency**](Currency.md) |  | 
**[countries](#countries)** | list, tuple,  | tuple,  |  | [optional] 
**items** | [**ObjectiveType**](ObjectiveType.md) | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**[optimization_goal_metadata](#optimization_goal_metadata)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) | [**CreativeType**](CreativeType.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# countries

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Country**](Country.md) | [**Country**](Country.md) | [**Country**](Country.md) |  | 

# optimization_goal_metadata

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# targeting_spec

Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Ad group targeting specification defining the ad group target audience. For example, &#x27;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x27; | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[AGE_BUCKET](#AGE_BUCKET)** | list, tuple,  | tuple,  | Values: [\&quot;18-24\&quot;,\&quot;21+\&quot;,\&quot;25-34\&quot;,\&quot;35-44\&quot;, \&quot;45-49\&quot;,\&quot;50-54\&quot;,\&quot;55-64\&quot;,\&quot;65+\&quot;] | [optional] 
**[APPTYPE](#APPTYPE)** | list, tuple,  | tuple,  | Values: [\&quot;android_mobile\&quot;, \&quot;android_tablet\&quot;, \&quot;ipad\&quot;, \&quot;iphone\&quot;, \&quot;web\&quot;, \&quot;web_mobile\&quot;] | [optional] 
**[AUDIENCE_EXCLUDE](#AUDIENCE_EXCLUDE)** | list, tuple,  | tuple,  | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. | [optional] 
**[AUDIENCE_INCLUDE](#AUDIENCE_INCLUDE)** | list, tuple,  | tuple,  | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them | [optional] 
**[GENDER](#GENDER)** | list, tuple,  | tuple,  | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;] | [optional] 
**[GEO](#GEO)** | list, tuple,  | tuple,  | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. | [optional] 
**[INTEREST](#INTEREST)** | list, tuple,  | tuple,  | &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Interest object IDs&lt;/a&gt;. | [optional] 
**[LOCALE](#LOCALE)** | list, tuple,  | tuple,  | 24 &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 639-1 two letter language codes&lt;/a&gt;. Values: [\&quot;cs\&quot;,\&quot;da\&quot;,\&quot;de\&quot;,\&quot;el\&quot;,\&quot;en\&quot;,\&quot;es\&quot;,\&quot;fi\&quot;,\&quot;fr\&quot;,\&quot;hu\&quot;, \&quot;id\&quot;,\&quot;in\&quot;,\&quot;it\&quot;,\&quot;ja\&quot;,\&quot;ko\&quot;,\&quot;no\&quot;,\&quot;pl\&quot;,\&quot;pt\&quot;,\&quot;ro\&quot;,\&quot;ru\&quot;,\&quot;sk\&quot;,\&quot;sv\&quot;,\&quot;tr\&quot;,\&quot;uk\&quot;,\&quot;zh\&quot;] | [optional] 
**[LOCATION](#LOCATION)** | list, tuple,  | tuple,  | 22 &lt;a href&#x3D;\&quot;https://www.nationsonline.org/oneworld/country_code_list.htm\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO Alpha 2&lt;/a&gt; two letter country codes or &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;US Nielsen DMA (Designated Market Area) codes&lt;/a&gt; (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot;&gt;click here&lt;/a&gt;. Location-Country and Location-Metro codes apply. | [optional] 
**[SHOPPING_RETARGETING](#SHOPPING_RETARGETING)** | list, tuple,  | tuple,  |  | [optional] 
**[TARGETING_STRATEGY](#TARGETING_STRATEGY)** | list, tuple,  | tuple,  | Values: [\&quot;CHOOSE_YOUR_OWN\&quot;, \&quot;FIND_NEW_CUSTOMERS\&quot;, \&quot;RECONNECT_WITH_USERS\&quot;] | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# AGE_BUCKET

Values: [\"18-24\",\"21+\",\"25-34\",\"35-44\", \"45-49\",\"50-54\",\"55-64\",\"65+\"]

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Values: [\&quot;18-24\&quot;,\&quot;21+\&quot;,\&quot;25-34\&quot;,\&quot;35-44\&quot;, \&quot;45-49\&quot;,\&quot;50-54\&quot;,\&quot;55-64\&quot;,\&quot;65+\&quot;] | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# APPTYPE

Values: [\"android_mobile\", \"android_tablet\", \"ipad\", \"iphone\", \"web\", \"web_mobile\"]

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Values: [\&quot;android_mobile\&quot;, \&quot;android_tablet\&quot;, \&quot;ipad\&quot;, \&quot;iphone\&quot;, \&quot;web\&quot;, \&quot;web_mobile\&quot;] | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# AUDIENCE_EXCLUDE

Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# AUDIENCE_INCLUDE

Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# GENDER

Targeted genders. Values: [\"unknown\",\"male\",\"female\"]

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;] | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# GEO

Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# INTEREST

<a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">Interest object IDs</a>.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Interest object IDs&lt;/a&gt;. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# LOCALE

24 <a href=\"https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\" target=\"_blank\">ISO 639-1 two letter language codes</a>. Values: [\"cs\",\"da\",\"de\",\"el\",\"en\",\"es\",\"fi\",\"fr\",\"hu\", \"id\",\"in\",\"it\",\"ja\",\"ko\",\"no\",\"pl\",\"pt\",\"ro\",\"ru\",\"sk\",\"sv\",\"tr\",\"uk\",\"zh\"]

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 24 &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 639-1 two letter language codes&lt;/a&gt;. Values: [\&quot;cs\&quot;,\&quot;da\&quot;,\&quot;de\&quot;,\&quot;el\&quot;,\&quot;en\&quot;,\&quot;es\&quot;,\&quot;fi\&quot;,\&quot;fr\&quot;,\&quot;hu\&quot;, \&quot;id\&quot;,\&quot;in\&quot;,\&quot;it\&quot;,\&quot;ja\&quot;,\&quot;ko\&quot;,\&quot;no\&quot;,\&quot;pl\&quot;,\&quot;pt\&quot;,\&quot;ro\&quot;,\&quot;ru\&quot;,\&quot;sk\&quot;,\&quot;sv\&quot;,\&quot;tr\&quot;,\&quot;uk\&quot;,\&quot;zh\&quot;] | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# LOCATION

22 <a href=\"https://www.nationsonline.org/oneworld/country_code_list.htm\" target=\"_blank\">ISO Alpha 2</a> two letter country codes or <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">US Nielsen DMA (Designated Market Area) codes</a> (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\">click here</a>. Location-Country and Location-Metro codes apply.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 22 &lt;a href&#x3D;\&quot;https://www.nationsonline.org/oneworld/country_code_list.htm\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO Alpha 2&lt;/a&gt; two letter country codes or &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;US Nielsen DMA (Designated Market Area) codes&lt;/a&gt; (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot;&gt;click here&lt;/a&gt;. Location-Country and Location-Metro codes apply. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# SHOPPING_RETARGETING

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**lookback_window** | decimal.Decimal, int,  | decimal.Decimal,  | Number of days ago to start lookback timeframe for dynamic retargeting | [optional] 
**[tag_types](#tag_types)** | list, tuple,  | tuple,  | Event types to target for dynamic retargeting | [optional] 
**exclusion_window** | decimal.Decimal, int,  | decimal.Decimal,  | Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# tag_types

Event types to target for dynamic retargeting

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Event types to target for dynamic retargeting | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | decimal.Decimal, int,  | decimal.Decimal,  |  | 

# TARGETING_STRATEGY

Values: [\"CHOOSE_YOUR_OWN\", \"FIND_NEW_CUSTOMERS\", \"RECONNECT_WITH_USERS\"]

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Values: [\&quot;CHOOSE_YOUR_OWN\&quot;, \&quot;FIND_NEW_CUSTOMERS\&quot;, \&quot;RECONNECT_WITH_USERS\&quot;] | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


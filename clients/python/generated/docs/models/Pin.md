# pinterestsdk.model.pin.Pin

Pin

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Pin | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str,  | str,  |  | [optional] 
**created_at** | str, datetime,  | str,  |  | [optional] value must conform to RFC-3339 date-time
**link** | None, str,  | NoneClass, str,  |  | [optional] 
**title** | None, str,  | NoneClass, str,  |  | [optional] 
**description** | None, str,  | NoneClass, str,  |  | [optional] 
**dominant_color** | None, str,  | NoneClass, str,  | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**alt_text** | None, str,  | NoneClass, str,  |  | [optional] 
**board_id** | str,  | str,  | The board to which this Pin belongs. | [optional] 
**board_section_id** | None, str,  | NoneClass, str,  | The board section to which this Pin belongs. | [optional] 
**[board_owner](#board_owner)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[media](#media)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[media_source](#media_source)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**parent_pin_id** | None, str,  | NoneClass, str,  | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# board_owner

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[BoardOwner](BoardOwner.md) | [**BoardOwner**](BoardOwner.md) | [**BoardOwner**](BoardOwner.md) |  | 

# media

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[PinMedia](PinMedia.md) | [**PinMedia**](PinMedia.md) | [**PinMedia**](PinMedia.md) |  | 

# media_source

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[PinMediaSource](PinMediaSource.md) | [**PinMediaSource**](PinMediaSource.md) | [**PinMediaSource**](PinMediaSource.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


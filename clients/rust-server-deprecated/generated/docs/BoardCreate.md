# BoardCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **swagger::Nullable<String>** |  | [optional] [default to None]
**is_ads_only** | **bool** | If set to `true`, the board will be ad-only and can store ad-only Pins. | [optional] [default to Some(false)]
**name** | **String** |     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". | 
**privacy** | [***models::BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



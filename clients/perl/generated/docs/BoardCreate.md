# WWW::OpenAPIClient::Object::BoardCreate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BoardCreate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] 
**is_ads_only** | **boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**name** | **string** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



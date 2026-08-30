# BoardCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional]
**is_ads_only** | **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**name** | **string** | Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. |
**privacy** | [**\OpenAPI\Client\Model\BoardPrivacy**](BoardPrivacy.md) | Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. | [optional] [default to BoardPrivacy::_PUBLIC]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

# AdAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | Option<[**models::Country**](Country.md)> |  | [optional]
**created_time** | Option<**i32**> |  Creation time. Unix timestamp in seconds. | [optional][readonly]
**currency** | Option<[**models::Currency**](Currency.md)> |  | [optional]
**id** | **String** |  | 
**name** | Option<**String**> | Ad account name. | [optional]
**owner** | Option<[**models::AdAccountOwner**](AdAccountOwner.md)> | Ad account owner | [optional][readonly]
**permissions** | Option<[**Vec<models::BusinessAccessRole>**](BusinessAccessRole.md)> |  | [optional][readonly]
**updated_time** | Option<**i32**> |  | [optional][readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



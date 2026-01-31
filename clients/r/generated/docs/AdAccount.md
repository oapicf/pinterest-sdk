# openapi::AdAccount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] [Enum: ] 
**created_time** | **integer** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**currency** | [**Currency**](Currency.md) |  | [optional] [Enum: ] 
**id** | **character** |  | [Pattern: ^\\d+$] [Max. length: 18] 
**name** | **character** | Ad account name. | [optional] [Max. length: 256] 
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**permissions** | [**array[BusinessAccessRole]**](BusinessAccessRole.md) |  | [optional] [readonly] 
**updated_time** | **integer** |  | [optional] [readonly] 



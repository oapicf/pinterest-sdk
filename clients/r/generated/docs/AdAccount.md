# openapi::AdAccount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** |  | [optional] 
**name** | **character** |  | [optional] 
**owner** | [**AdAccountOwner**](Ad_account_owner.md) |  | [optional] 
**country** | [**Country**](Country.md) |  | [optional] [Enum: ] 
**currency** | [**Currency**](Currency.md) |  | [optional] [Enum: ] 
**permissions** | [**array[BusinessAccessRole]**](BusinessAccessRole.md) |  | [optional] 
**created_time** | **integer** | Creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **integer** | Last update time. Unix timestamp in seconds. | [optional] 



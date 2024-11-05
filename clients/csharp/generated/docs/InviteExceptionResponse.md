# Org.OpenAPITools.Model.InviteExceptionResponse
An exception object if there is an error performing the action. Will only be provided if there is an error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteOrRequestId** | **string** | Unique identifier of the invite/request. | [optional] 
**Code** | **int** | Error code associated with the error in performing the action on the invite/request. | [optional] 
**Message** | **string** | Error message associated with the error in performing the action on the invite/request. | [optional] 
**UsersOrPartnerIds** | **List&lt;string&gt;** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


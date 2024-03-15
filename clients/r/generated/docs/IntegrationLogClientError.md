# openapi::IntegrationLogClientError

System error details included in the log sent by the client.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cause** | **character** | Original cause of the error. | [optional] [Max. length: 512] 
**column_number** | **integer** | Column number in the line of the file that raised the error. | [optional] 
**file_name** | **character** | Filename where the error happened. | [optional] [Max. length: 256] 
**line_number** | **integer** | Line number where the error happened. | [optional] 
**message** | **character** | Human-readable description of the error. | [optional] [Max. length: 512] 
**message_detail** | **character** | More detail about the message. | [optional] [Max. length: 1024] 
**name** | **character** | Filename where the error happened. | [optional] [Max. length: 256] 
**number** | **integer** | Integer that specifies the error code. | [optional] 
**stack_trace** | **character** | Stack trace of where the error happened. | [optional] 



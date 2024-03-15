
# Table `IntegrationLogClientError`
(mapped from: IntegrationLogClientError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**cause** | cause | text |  | **kotlin.String** | Original cause of the error. |  [optional]
**columnNumber** | column_number | int |  | **kotlin.Int** | Column number in the line of the file that raised the error. |  [optional]
**fileName** | file_name | text |  | **kotlin.String** | Filename where the error happened. |  [optional]
**lineNumber** | line_number | int |  | **kotlin.Int** | Line number where the error happened. |  [optional]
**message** | message | text |  | **kotlin.String** | Human-readable description of the error. |  [optional]
**messageDetail** | message_detail | text |  | **kotlin.String** | More detail about the message. |  [optional]
**name** | name | text |  | **kotlin.String** | Filename where the error happened. |  [optional]
**number** | number | int |  | **kotlin.Int** | Integer that specifies the error code. |  [optional]
**stackTrace** | stack_trace | text |  | **kotlin.String** | Stack trace of where the error happened. |  [optional]












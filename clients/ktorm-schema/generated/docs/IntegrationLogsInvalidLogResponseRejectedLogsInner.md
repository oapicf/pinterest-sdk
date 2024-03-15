
# Table `IntegrationLogsInvalidLogResponse_rejected_logs_inner`
(mapped from: IntegrationLogsInvalidLogResponseRejectedLogsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | **kotlin.String** | The field name containing an invalid value. | 
**value** | value | text NOT NULL |  | **kotlin.String** | The value that is invalid. | 
**reason** | reason | text NOT NULL |  | **kotlin.String** | The reason the value is invalid. | 
**logIndex** | log_index | int |  | **kotlin.Int** | Index of the log in the batch. |  [optional]







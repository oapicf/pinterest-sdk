
# Table `NotificationResponse`
(mapped from: NotificationResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**success** | success | boolean |  | **kotlin.Boolean** | Returns true if the notification accepted. |  [optional]
**receivedAt** | received_at | int |  | **kotlin.Int** | Received time. Unix timestamp in seconds. |  [optional]
**errorMsg** | error_msg | text |  | **kotlin.String** | error message when success is false |  [optional]






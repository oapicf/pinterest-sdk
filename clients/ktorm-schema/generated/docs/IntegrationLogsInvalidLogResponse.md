
# Table `IntegrationLogsInvalidLogResponse`
(mapped from: IntegrationLogsInvalidLogResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rejectedLogs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;IntegrationLogsInvalidLogResponseRejectedLogsInner&gt;**](IntegrationLogsInvalidLogResponseRejectedLogsInner.md) |  |  [optional]


# **Table `IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsInner`**
(mapped from: IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
integrationLogsInvalidLogResponse | integrationLogsInvalidLogResponse | long | | kotlin.Long | Primary Key | *one*
integrationLogsInvalidLogResponseRejectedLogsInner | integrationLogsInvalidLogResponseRejectedLogsInner | long | | kotlin.Long | Foreign Key | *many*





# Table `IntegrationLogsInvalidLogResponse`
(mapped from: IntegrationLogsInvalidLogResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rejectedLogs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;IntegrationLogsInvalidLogResponseRejectedLogsItems&gt;**](IntegrationLogsInvalidLogResponseRejectedLogsItems.md) |  |  [optional]


# **Table `IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsItems`**
(mapped from: IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
integrationLogsInvalidLogResponse | integrationLogsInvalidLogResponse | long | | kotlin.Long | Primary Key | *one*
integrationLogsInvalidLogResponseRejectedLogsItems | integrationLogsInvalidLogResponseRejectedLogsItems | long | | kotlin.Long | Foreign Key | *many*




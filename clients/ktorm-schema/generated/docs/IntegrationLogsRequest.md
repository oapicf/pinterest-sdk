
# Table `IntegrationLogsRequest`
(mapped from: IntegrationLogsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**logs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;IntegrationLog&gt;**](IntegrationLog.md) |  | 


# **Table `IntegrationLogsRequestIntegrationLog`**
(mapped from: IntegrationLogsRequestIntegrationLog)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
integrationLogsRequest | integrationLogsRequest | long | | kotlin.Long | Primary Key | *one*
integrationLog | integrationLog | long | | kotlin.Long | Foreign Key | *many*




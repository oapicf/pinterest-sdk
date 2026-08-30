
# Table `IntegrationLogsRequestCreate`
(mapped from: IntegrationLogsRequestCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**logs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;IntegrationLog&gt;**](IntegrationLog.md) |  | 


# **Table `IntegrationLogsRequestCreateIntegrationLog`**
(mapped from: IntegrationLogsRequestCreateIntegrationLog)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
integrationLogsRequestCreate | integrationLogsRequestCreate | long | | kotlin.Long | Primary Key | *one*
integrationLog | integrationLog | long | | kotlin.Long | Foreign Key | *many*




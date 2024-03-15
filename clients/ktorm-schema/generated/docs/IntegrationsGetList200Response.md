
# Table `integrations_get_list_200_response`
(mapped from: IntegrationsGetList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;IntegrationRecord&gt;**](IntegrationRecord.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `IntegrationsGetList200ResponseIntegrationRecord`**
(mapped from: IntegrationsGetList200ResponseIntegrationRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
integrationsGetList200Response | integrationsGetList200Response | long | | kotlin.Long | Primary Key | *one*
integrationRecord | integrationRecord | long | | kotlin.Long | Foreign Key | *many*





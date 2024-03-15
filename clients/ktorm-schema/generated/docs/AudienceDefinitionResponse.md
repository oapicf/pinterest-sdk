
# Table `AudienceDefinitionResponse`
(mapped from: AudienceDefinitionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AudienceDefinition&gt;**](AudienceDefinition.md) |  |  [optional]


# **Table `AudienceDefinitionResponseAudienceDefinition`**
(mapped from: AudienceDefinitionResponseAudienceDefinition)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceDefinitionResponse | audienceDefinitionResponse | long | | kotlin.Long | Primary Key | *one*
audienceDefinition | audienceDefinition | long | | kotlin.Long | Foreign Key | *many*




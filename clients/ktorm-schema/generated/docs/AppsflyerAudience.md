
# Table `AppsflyerAudience`
(mapped from: AppsflyerAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**containerId** | container_id | text NOT NULL |  | **kotlin.String** | The ID of the audience container |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name of the audience | 
**platform** | platform | long NOT NULL |  | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience |  [foreignkey]






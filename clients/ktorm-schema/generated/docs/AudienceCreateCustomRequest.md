
# Table `AudienceCreateCustomRequest`
(mapped from: AudienceCreateCustomRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Audience name. | 
**rule** | rule | long NOT NULL |  | [**AudienceRule**](AudienceRule.md) |  |  [foreignkey]
**sharingType** | sharing_type | long NOT NULL |  | [**AudienceSharingType**](AudienceSharingType.md) |  |  [foreignkey]
**dataParty** | data_party | long NOT NULL |  | [**AudienceDataParty**](AudienceDataParty.md) |  |  [foreignkey]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**category** | category | text |  | **kotlin.String** |  |  [optional]









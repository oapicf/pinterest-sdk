
# Table `SharedAudienceAccount`
(mapped from: SharedAudienceAccount)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accountId** | account_id | text NOT NULL |  | **kotlin.String** | Account ID (ad account or business ID). | 
**accountName** | account_name | text NOT NULL |  | **kotlin.String** | Account name. | 
**accountType** | account_type | text NOT NULL |  | [**account_type**](#AccountType) | account type | 
**sharedOnTimestamp** | shared_on_timestamp | int NOT NULL |  | **kotlin.Int** | Epoch timestamp in seconds for the shared audience event | 







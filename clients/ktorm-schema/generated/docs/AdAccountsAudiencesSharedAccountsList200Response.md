
# Table `ad_accounts_audiences_shared_accounts_list_200_response`
(mapped from: AdAccountsAudiencesSharedAccountsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SharedAudienceAccount&gt;**](SharedAudienceAccount.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdAccountsAudiencesSharedAccountsList200ResponseSharedAudienceAccount`**
(mapped from: AdAccountsAudiencesSharedAccountsList200ResponseSharedAudienceAccount)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountsAudiencesSharedAccountsList200Response | adAccountsAudiencesSharedAccountsList200Response | long | | kotlin.Long | Primary Key | *one*
sharedAudienceAccount | sharedAudienceAccount | long | | kotlin.Long | Foreign Key | *many*






# Table `ad_accounts_subscriptions_get_list_200_response`
(mapped from: AdAccountsSubscriptionsGetList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadSubscription&gt;**](LeadSubscription.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdAccountsSubscriptionsGetList200ResponseLeadSubscription`**
(mapped from: AdAccountsSubscriptionsGetList200ResponseLeadSubscription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountsSubscriptionsGetList200Response | adAccountsSubscriptionsGetList200Response | long | | kotlin.Long | Primary Key | *one*
leadSubscription | leadSubscription | long | | kotlin.Long | Foreign Key | *many*





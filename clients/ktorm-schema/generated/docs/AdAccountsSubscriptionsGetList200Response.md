
# Table `ad_accounts_subscriptions_get_list_200_response`
(mapped from: AdAccountsSubscriptionsGetList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdAccountGetSubscriptionResponse&gt;**](AdAccountGetSubscriptionResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdAccountsSubscriptionsGetList200ResponseAdAccountGetSubscriptionResponse`**
(mapped from: AdAccountsSubscriptionsGetList200ResponseAdAccountGetSubscriptionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountsSubscriptionsGetList200Response | adAccountsSubscriptionsGetList200Response | long | | kotlin.Long | Primary Key | *one*
adAccountGetSubscriptionResponse | adAccountGetSubscriptionResponse | long | | kotlin.Long | Foreign Key | *many*





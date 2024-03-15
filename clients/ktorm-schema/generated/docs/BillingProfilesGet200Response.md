
# Table `billing_profiles_get_200_response`
(mapped from: BillingProfilesGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BillingProfilesResponse&gt;**](BillingProfilesResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BillingProfilesGet200ResponseBillingProfilesResponse`**
(mapped from: BillingProfilesGet200ResponseBillingProfilesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
billingProfilesGet200Response | billingProfilesGet200Response | long | | kotlin.Long | Primary Key | *one*
billingProfilesResponse | billingProfilesResponse | long | | kotlin.Long | Foreign Key | *many*





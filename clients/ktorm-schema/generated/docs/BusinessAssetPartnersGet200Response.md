
# Table `business_asset_partners_get_200_response`
(mapped from: BusinessAssetPartnersGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserSingleAssetBinding&gt;**](UserSingleAssetBinding.md) | List of partners with permissions to the asset. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BusinessAssetPartnersGet200ResponseUserSingleAssetBinding`**
(mapped from: BusinessAssetPartnersGet200ResponseUserSingleAssetBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessAssetPartnersGet200Response | businessAssetPartnersGet200Response | long | | kotlin.Long | Primary Key | *one*
userSingleAssetBinding | userSingleAssetBinding | long | | kotlin.Long | Foreign Key | *many*






# Table `brand_accounts_update_request`
(mapped from: BrandAccountsUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | Brand Account name |  [optional]
**username** | username | text |  | **kotlin.String** | Brand Account username |  [optional]
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**about** | about | text |  | **kotlin.String** | Brand Account about information |  [optional]
**website** | website | text |  | **kotlin.String** | Brand Account website |  [optional]
**profileImage** | profile_image | long |  | [**ImageBase64**](ImageBase64.md) |  |  [optional] [foreignkey]









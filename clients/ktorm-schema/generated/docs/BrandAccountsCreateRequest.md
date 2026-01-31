
# Table `brand_accounts_create_request`
(mapped from: BrandAccountsCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Brand Account name | 
**username** | username | text NOT NULL |  | **kotlin.String** | Brand Account username | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**about** | about | text |  | **kotlin.String** | Brand Account about information |  [optional]
**website** | website | text |  | **kotlin.String** | Brand Account website |  [optional]
**profileImage** | profile_image | long |  | [**ImageBase64**](ImageBase64.md) |  |  [optional] [foreignkey]









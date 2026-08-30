
# Table `BrandAccountCreate`
(mapped from: BrandAccountCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**name** | name | text NOT NULL |  | **kotlin.String** | Brand Account name | 
**username** | username | text NOT NULL |  | **kotlin.String** | Brand Account username | 
**about** | about | text |  | **kotlin.String** | Brand Account about information |  [optional]
**profileImage** | profile_image | long |  | [**BrandAccountProfileImage**](BrandAccountProfileImage.md) |  |  [optional] [foreignkey]
**website** | website | text |  | **kotlin.String** | Brand Account website |  [optional]










# Table `CustomerListRequest`
(mapped from: CustomerListRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Customer list name. | 
**records** | records | text NOT NULL |  | **kotlin.String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**listType** | list_type | long |  | [**UserListType**](UserListType.md) |  |  [optional] [foreignkey]
**exceptions** | exceptions | blob |  | [**kotlin.Any**](.md) | Customer list errors. |  [optional]







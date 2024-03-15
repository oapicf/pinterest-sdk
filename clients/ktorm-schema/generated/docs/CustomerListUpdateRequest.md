
# Table `CustomerListUpdateRequest`
(mapped from: CustomerListUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**records** | records | text NOT NULL |  | **kotlin.String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**operationType** | operation_type | long NOT NULL |  | [**UserListOperationType**](UserListOperationType.md) |  |  [foreignkey]
**exceptions** | exceptions | long |  | [**Exception**](.md) |  |  [optional] [foreignkey]






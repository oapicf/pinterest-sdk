
# Table `CustomerListUpdateWithRequiredBody`
(mapped from: CustomerListUpdateWithRequiredBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**operationType** | operation_type | long NOT NULL |  | [**UserListOperationType**](UserListOperationType.md) | Customer list update operation type (add or remove). Only valid in update request body. |  [foreignkey]
**records** | records | text |  | **kotlin.String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. |  [optional]
**recordsV2** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CustomerListRecordRow&gt;**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. |  [optional]




# **Table `CustomerListUpdateWithRequiredBodyCustomerListRecordRow`**
(mapped from: CustomerListUpdateWithRequiredBodyCustomerListRecordRow)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
customerListUpdateWithRequiredBody | customerListUpdateWithRequiredBody | long | | kotlin.Long | Primary Key | *one*
customerListRecordRow | customerListRecordRow | long | | kotlin.Long | Foreign Key | *many*




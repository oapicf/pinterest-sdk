

# CustomerListUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

The class is defined in **[CustomerListUpdateWithRequiredBody.java](../../src/main/java/org/openapitools/model/CustomerListUpdateWithRequiredBody.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operationType** | `UserListOperationType` | Customer list update operation type (add or remove). Only valid in update request body. | 
**records** | `String` | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. |  [optional property]
**recordsV2** | [`List&lt;CustomerListRecordRow&gt;`](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. |  [optional property]






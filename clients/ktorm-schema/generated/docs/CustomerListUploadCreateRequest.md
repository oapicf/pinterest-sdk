
# Table `CustomerListUploadCreateRequest`
(mapped from: CustomerListUploadCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**operation** | operation | long NOT NULL |  | [**UserListOperationType**](UserListOperationType.md) |  |  [foreignkey]
**totalParts** | total_parts | int UNSIGNED NOT NULL |  | **kotlin.Int** | Number of parts to upload the file in. | 





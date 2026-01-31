
# Table `CustomerListUpload`
(mapped from: CustomerListUpload)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | Advertiser ID. | 
**creationTime** | creation_time | int NOT NULL |  | **kotlin.Int** | Customer List Upload creation_time. Epoch (seconds). | 
**customerListId** | customer_list_id | text NOT NULL |  | **kotlin.String** | ID of the customer list associated with this upload. | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Customer List Upload ID. | 
**operation** | operation | long NOT NULL |  | [**UserListOperationType**](UserListOperationType.md) |  |  [foreignkey]
**state** | state | text NOT NULL |  | [**state**](#State) | Workload processing state | 
**updatedTime** | updated_time | int NOT NULL |  | **kotlin.Int** | Customer List Upload updated_time. Epoch (seconds). | 
**errorCounts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ErrorDetail&gt;**](ErrorDetail.md) | Error counts by error code |  [optional]
**recordCounts** | record_counts | long |  | [**RecordCounts**](RecordCounts.md) |  |  [optional] [foreignkey]









# **Table `CustomerListUploadErrorDetail`**
(mapped from: CustomerListUploadErrorDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
customerListUpload | customerListUpload | long | | kotlin.Long | Primary Key | *one*
errorDetail | errorDetail | long | | kotlin.Long | Foreign Key | *many*





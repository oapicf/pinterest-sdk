
# Table `S3MultipartUploadData`
(mapped from: S3MultipartUploadData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**fileParts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;S3FilePart&gt;**](S3FilePart.md) | Array of file parts with pre-signed URLs. |  [optional]


# **Table `S3MultipartUploadDataS3FilePart`**
(mapped from: S3MultipartUploadDataS3FilePart)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
s3MultipartUploadData | s3MultipartUploadData | long | | kotlin.Long | Primary Key | *one*
s3FilePart | s3FilePart | long | | kotlin.Long | Foreign Key | *many*




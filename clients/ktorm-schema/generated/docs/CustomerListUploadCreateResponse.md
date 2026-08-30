
# Table `CustomerListUploadCreateResponse`
(mapped from: CustomerListUploadCreateResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**customerListUpload** | customer_list_upload | long NOT NULL |  | [**CustomerListUpload**](CustomerListUpload.md) | The Customer List Upload created. |  [foreignkey]
**s3MultipartUploadData** | s3_multipart_upload_data | long NOT NULL |  | [**S3MultipartUploadData**](S3MultipartUploadData.md) | Pre-signed upload URLs corresponding to each part of the upload. |  [foreignkey]





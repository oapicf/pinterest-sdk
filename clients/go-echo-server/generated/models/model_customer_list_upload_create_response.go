package models

type CustomerListUploadCreateResponse struct {

	CustomerListUpload CustomerListUpload `json:"customer_list_upload"`

	S3MultipartUploadData S3MultipartUploadData `json:"s3_multipart_upload_data"`
}

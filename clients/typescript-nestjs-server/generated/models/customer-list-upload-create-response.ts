import { CustomerListUpload } from './customer-list-upload';
import { S3MultipartUploadData } from './s3-multipart-upload-data';


export interface CustomerListUploadCreateResponse { 
  /**
   * The Customer List Upload created.
   */
  customer_list_upload: CustomerListUpload;
  /**
   * Pre-signed upload URLs corresponding to each part of the upload.
   */
  s3_multipart_upload_data: S3MultipartUploadData;
}


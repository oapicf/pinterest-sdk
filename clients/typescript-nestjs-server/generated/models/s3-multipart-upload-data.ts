import { S3FilePart } from './s3-file-part';


export interface S3MultipartUploadData { 
  /**
   * Array of file parts with pre-signed URLs.
   */
  file_parts?: Array<S3FilePart>;
}




export interface DynamicTitlesUploadURL { 
  /**
   * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
   */
  existing_filename?: string;
  /**
   * Unique identifier for this upload session. Must be passed to the process endpoint.
   */
  request_id: string;
  /**
   * Pre-signed S3 PUT URL to upload the reviewed CSV file.
   */
  upload_url: string;
}


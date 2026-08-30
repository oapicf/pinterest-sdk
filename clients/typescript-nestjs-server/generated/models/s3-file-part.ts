

export interface S3FilePart { 
  /**
   * Part number for upload.
   */
  part_number: number;
  /**
   * Pre-signed URL.
   */
  presigned_url: string;
}


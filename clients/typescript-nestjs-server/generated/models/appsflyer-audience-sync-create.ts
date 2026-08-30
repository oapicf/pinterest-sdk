

/**
 * Resource create operation model.
 */
export interface AppsflyerAudienceSyncCreate { 
  /**
   * The container ID of the audience
   */
  container_id: string;
  /**
   * The pre-signed URL for SHA256 hashed GAID/IDFA file
   */
  url_adid_sha256?: string;
  /**
   * The pre-signed URL for SHA256 hashed email file
   */
  url_email_sha256?: string;
}


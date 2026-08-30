import { MediaUploadParameters } from './media-upload-parameters';
import { MediaUploadType } from './media-upload-type';


/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
export interface MediaUpload { 
  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   */
  readonly media_id: string;
  media_type: MediaUploadType;
  /**
   * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
   */
  readonly upload_parameters?: MediaUploadParameters;
  /**
   * The URL where you will POST your media file.
   */
  readonly upload_url?: string;
}
export namespace MediaUpload {
}



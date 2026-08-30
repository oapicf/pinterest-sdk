import { MediaUploadType } from './media-upload-type';
import { MediaUploadStatus } from './media-upload-status';


export interface Media { 
  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   */
  readonly media_id: string;
  media_type: MediaUploadType;
  readonly status?: MediaUploadStatus;
}
export namespace Media {
}



import { ImageSize } from './image-size';


/**
 * Pin with video.
 */
export interface PinMediaWithVideo { 
  cover_image_url?: string;
  /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   */
  duration?: number | null;
  /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   */
  height?: number | null;
  images?: ImageSize;
  media_type: PinMediaWithVideo.MediaTypeEnum;
  /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   */
  video_url?: string | null;
  /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   */
  video_url_hls?: string | null;
  /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   */
  width?: number | null;
}
export namespace PinMediaWithVideo {
  export const MediaTypeEnum = {
    Video: 'video'
  } as const;
  export type MediaTypeEnum = typeof MediaTypeEnum[keyof typeof MediaTypeEnum];
}



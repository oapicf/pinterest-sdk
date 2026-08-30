import { VideoMetadataWithItemType } from './video-metadata-with-item-type';


/**
 * Pin with multiple videos.
 */
export interface PinMediaWithVideos { 
  items?: Array<VideoMetadataWithItemType>;
  media_type: PinMediaWithVideos.MediaTypeEnum;
}
export namespace PinMediaWithVideos {
  export const MediaTypeEnum = {
    MultipleVideos: 'multiple_videos'
  } as const;
  export type MediaTypeEnum = typeof MediaTypeEnum[keyof typeof MediaTypeEnum];
}



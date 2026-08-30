import { PinMediaMetadata } from './pin-media-metadata';


/**
 * Pin with a mix of images and videos.
 */
export interface PinMediaWithImageAndVideo { 
  items?: Array<PinMediaMetadata>;
  media_type: PinMediaWithImageAndVideo.MediaTypeEnum;
}
export namespace PinMediaWithImageAndVideo {
  export const MediaTypeEnum = {
    MultipleMixed: 'multiple_mixed'
  } as const;
  export type MediaTypeEnum = typeof MediaTypeEnum[keyof typeof MediaTypeEnum];
}



import { ImageSize } from './image-size';


/**
 * Pin with image.
 */
export interface PinMediaWithImage { 
  images?: ImageSize;
  media_type: PinMediaWithImage.MediaTypeEnum;
}
export namespace PinMediaWithImage {
  export const MediaTypeEnum = {
    Image: 'image'
  } as const;
  export type MediaTypeEnum = typeof MediaTypeEnum[keyof typeof MediaTypeEnum];
}



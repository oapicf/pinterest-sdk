import { ImageMetadata } from './image-metadata';


/**
 * Pin with multiple images.
 */
export interface PinMediaWithImages { 
  items?: Array<ImageMetadata>;
  media_type: PinMediaWithImages.MediaTypeEnum;
}
export namespace PinMediaWithImages {
  export const MediaTypeEnum = {
    MultipleImages: 'multiple_images'
  } as const;
  export type MediaTypeEnum = typeof MediaTypeEnum[keyof typeof MediaTypeEnum];
}



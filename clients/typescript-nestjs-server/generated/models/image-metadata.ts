import { ImageSize } from './image-size';


export interface ImageMetadata { 
  description?: string | null;
  images?: ImageSize;
  /**
   * Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
   */
  item_type: ImageMetadata.ItemTypeEnum;
  link?: string | null;
  title?: string | null;
}
export namespace ImageMetadata {
  export const ItemTypeEnum = {
    Image: 'image'
  } as const;
  export type ItemTypeEnum = typeof ItemTypeEnum[keyof typeof ItemTypeEnum];
}



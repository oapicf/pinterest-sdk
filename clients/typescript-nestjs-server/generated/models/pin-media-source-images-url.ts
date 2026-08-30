import { PinMediaSourceImagesURLItem } from './pin-media-source-images-url-item';


/**
 * Multiple URL-based images media source
 */
export interface PinMediaSourceImagesURL { 
  index?: number;
  /**
   * Array with image objects.
   */
  items: Array<PinMediaSourceImagesURLItem>;
  /**
   * The source type of the media.
   */
  source_type: PinMediaSourceImagesURL.SourceTypeEnum;
}
export namespace PinMediaSourceImagesURL {
  export const SourceTypeEnum = {
    MultipleImageUrls: 'multiple_image_urls'
  } as const;
  export type SourceTypeEnum = typeof SourceTypeEnum[keyof typeof SourceTypeEnum];
}



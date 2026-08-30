import { PinMediaSourceImagesBase64Item } from './pin-media-source-images-base64-item';


/**
 * Multiple Base64-based images media source
 */
export interface PinMediaSourceImagesBase64 { 
  index?: number;
  /**
   * Array with image objects.
   */
  items: Array<PinMediaSourceImagesBase64Item>;
  /**
   * The source type of the media.
   */
  source_type: PinMediaSourceImagesBase64.SourceTypeEnum;
}
export namespace PinMediaSourceImagesBase64 {
  export const SourceTypeEnum = {
    MultipleImageBase64: 'multiple_image_base64'
  } as const;
  export type SourceTypeEnum = typeof SourceTypeEnum[keyof typeof SourceTypeEnum];
}



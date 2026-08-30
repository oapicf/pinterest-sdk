import { ContentType } from './content-type';


/**
 * Image Base64-based media source.
 */
export interface PinMediaSourceImageBase64 { 
  content_type: ContentType;
  data: string;
  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
  is_standard?: boolean;
  /**
   * The source type of the media.
   */
  source_type: PinMediaSourceImageBase64.SourceTypeEnum;
}
export namespace PinMediaSourceImageBase64 {
  export const SourceTypeEnum = {
    ImageBase64: 'image_base64'
  } as const;
  export type SourceTypeEnum = typeof SourceTypeEnum[keyof typeof SourceTypeEnum];
}



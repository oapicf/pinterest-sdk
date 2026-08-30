

/**
 * Image URL-based media source.
 */
export interface PinMediaSourceImageURL { 
  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
  is_standard?: boolean;
  /**
   * The source type of the media.
   */
  source_type: PinMediaSourceImageURL.SourceTypeEnum;
  url: string;
}
export namespace PinMediaSourceImageURL {
  export const SourceTypeEnum = {
    ImageUrl: 'image_url'
  } as const;
  export type SourceTypeEnum = typeof SourceTypeEnum[keyof typeof SourceTypeEnum];
}



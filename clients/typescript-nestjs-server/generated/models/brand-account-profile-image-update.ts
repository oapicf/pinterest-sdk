

/**
 * Base64-encoded image media source
 */
export interface BrandAccountProfileImageUpdate { 
  content_type?: BrandAccountProfileImageUpdate.ContentTypeEnum;
  data?: string;
}
export namespace BrandAccountProfileImageUpdate {
  export const ContentTypeEnum = {
    ImageJpeg: 'image/jpeg',
    ImagePng: 'image/png'
  } as const;
  export type ContentTypeEnum = typeof ContentTypeEnum[keyof typeof ContentTypeEnum];
}



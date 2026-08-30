

/**
 * Base64-encoded image media source
 */
export interface BrandAccountProfileImage { 
  content_type: BrandAccountProfileImage.ContentTypeEnum;
  data: string;
}
export namespace BrandAccountProfileImage {
  export const ContentTypeEnum = {
    ImageJpeg: 'image/jpeg',
    ImagePng: 'image/png'
  } as const;
  export type ContentTypeEnum = typeof ContentTypeEnum[keyof typeof ContentTypeEnum];
}



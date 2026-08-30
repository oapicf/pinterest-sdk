

export const AdPinPreviewCreativeType = {
    Shopping: 'SHOPPING',
    Collection: 'COLLECTION',
    MaxVideo: 'MAX_VIDEO',
    MaxWidthVideoCollection: 'MAX_WIDTH_VIDEO_COLLECTION',
    MaxWidthRegularCollection: 'MAX_WIDTH_REGULAR_COLLECTION'
} as const;
export type AdPinPreviewCreativeType = typeof AdPinPreviewCreativeType[keyof typeof AdPinPreviewCreativeType];


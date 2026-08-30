

export const MediaUploadType = {
    Video: 'video'
} as const;
export type MediaUploadType = typeof MediaUploadType[keyof typeof MediaUploadType];


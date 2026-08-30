

export const ContentType = {
    ImageJpeg: 'image/jpeg',
    ImagePng: 'image/png'
} as const;
export type ContentType = typeof ContentType[keyof typeof ContentType];


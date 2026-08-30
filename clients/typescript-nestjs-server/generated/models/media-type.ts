

export const MediaType = {
    Image: 'IMAGE',
    Video: 'VIDEO'
} as const;
export type MediaType = typeof MediaType[keyof typeof MediaType];


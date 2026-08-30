

export const BasePreferredMediaType = {
    Video: 'VIDEO',
    Image: 'IMAGE'
} as const;
export type BasePreferredMediaType = typeof BasePreferredMediaType[keyof typeof BasePreferredMediaType];


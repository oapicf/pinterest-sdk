

export const PinType = {
    Private: 'PRIVATE'
} as const;
export type PinType = typeof PinType[keyof typeof PinType];


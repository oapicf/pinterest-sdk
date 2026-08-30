

export const Gender = {
    Female: 'FEMALE',
    Male: 'MALE',
    Unisex: 'UNISEX'
} as const;
export type Gender = typeof Gender[keyof typeof Gender];


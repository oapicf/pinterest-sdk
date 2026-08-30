

export const GenderBucket = {
    Male: 'MALE',
    Female: 'FEMALE',
    Unspecified: 'UNSPECIFIED'
} as const;
export type GenderBucket = typeof GenderBucket[keyof typeof GenderBucket];


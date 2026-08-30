

/**
 * Gender category for trends demographic distribution.
 */
export const TrendsGender = {
    Male: 'male',
    Female: 'female',
    Unspecified: 'unspecified'
} as const;
export type TrendsGender = typeof TrendsGender[keyof typeof TrendsGender];


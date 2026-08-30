

/**
 * Gender category for trends demographic distribution.
 */
export const TrendsGenderFilter = {
    Male: 'male',
    Female: 'female',
    Unknown: 'unknown'
} as const;
export type TrendsGenderFilter = typeof TrendsGenderFilter[keyof typeof TrendsGenderFilter];


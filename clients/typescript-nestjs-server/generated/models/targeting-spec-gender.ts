

export const TargetingSpecGender = {
    Unknown: 'unknown',
    Male: 'male',
    Female: 'female'
} as const;
export type TargetingSpecGender = typeof TargetingSpecGender[keyof typeof TargetingSpecGender];


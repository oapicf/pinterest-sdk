

/**
 * Label type values.
 */
export const LabelType = {
    Brand: 'BRAND',
    Custom: 'CUSTOM'
} as const;
export type LabelType = typeof LabelType[keyof typeof LabelType];


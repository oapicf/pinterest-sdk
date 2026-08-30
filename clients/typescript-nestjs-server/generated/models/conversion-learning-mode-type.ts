

/**
 * oCPM learn mode.
 */
export const ConversionLearningModeType = {
    NotActive: 'NOT_ACTIVE',
    Active: 'ACTIVE'
} as const;
export type ConversionLearningModeType = typeof ConversionLearningModeType[keyof typeof ConversionLearningModeType];


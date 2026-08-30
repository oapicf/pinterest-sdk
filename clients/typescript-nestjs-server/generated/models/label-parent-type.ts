

/**
 * Label parent entity type.
 */
export const LabelParentType = {
    Campaign: 'CAMPAIGN'
} as const;
export type LabelParentType = typeof LabelParentType[keyof typeof LabelParentType];


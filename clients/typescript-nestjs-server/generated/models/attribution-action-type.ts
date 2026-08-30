

/**
 * Type of an attributed action.
 */
export const AttributionActionType = {
    View: 'view',
    Click: 'click'
} as const;
export type AttributionActionType = typeof AttributionActionType[keyof typeof AttributionActionType];


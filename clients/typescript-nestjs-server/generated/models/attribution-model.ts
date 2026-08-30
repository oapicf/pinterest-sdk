

/**
 * Attribution model used to attribute the conversion event.
 */
export const AttributionModel = {
    FirstTouch: 'first_touch',
    LastTouch: 'last_touch',
    MultiTouch: 'multi_touch',
    Mmm: 'mmm'
} as const;
export type AttributionModel = typeof AttributionModel[keyof typeof AttributionModel];


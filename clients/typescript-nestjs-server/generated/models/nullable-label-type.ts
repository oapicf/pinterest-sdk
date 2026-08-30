

/**
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */
export const NullableLabelType = {
    Brand: 'BRAND',
    Custom: 'CUSTOM'
} as const;
export type NullableLabelType = typeof NullableLabelType[keyof typeof NullableLabelType];


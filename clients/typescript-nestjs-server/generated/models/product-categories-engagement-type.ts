

export const ProductCategoriesEngagementType = {
    Engagement: 'ENGAGEMENT',
    OutboundClick: 'OUTBOUND_CLICK',
    Save: 'SAVE'
} as const;
export type ProductCategoriesEngagementType = typeof ProductCategoriesEngagementType[keyof typeof ProductCategoriesEngagementType];


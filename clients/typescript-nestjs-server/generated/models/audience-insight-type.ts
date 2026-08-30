

export const AudienceInsightType = {
    YourTotalAudience: 'YOUR_TOTAL_AUDIENCE',
    YourEngagedAudience: 'YOUR_ENGAGED_AUDIENCE',
    PinterestTotalAudience: 'PINTEREST_TOTAL_AUDIENCE'
} as const;
export type AudienceInsightType = typeof AudienceInsightType[keyof typeof AudienceInsightType];




/**
 * Error code returned for a campaign planning estimate failure.
 */
export const CampaignPlanningResponseErrorCode = {
    ServerError: 'SERVER_ERROR',
    AudienceListMissing: 'AUDIENCE_LIST_MISSING',
    InvalidRequest: 'INVALID_REQUEST',
    ProductGroupMissing: 'PRODUCT_GROUP_MISSING'
} as const;
export type CampaignPlanningResponseErrorCode = typeof CampaignPlanningResponseErrorCode[keyof typeof CampaignPlanningResponseErrorCode];


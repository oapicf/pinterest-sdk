

/**
 * Account type filter for audience sharing.
 */
export const AudienceAccountType = {
    AdAccount: 'AD_ACCOUNT',
    BusinessAccount: 'BUSINESS_ACCOUNT'
} as const;
export type AudienceAccountType = typeof AudienceAccountType[keyof typeof AudienceAccountType];


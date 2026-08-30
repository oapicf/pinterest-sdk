

/**
 * Permission levels available on a business asset.
 */
export const Permissions = {
    Admin: 'ADMIN',
    Analyst: 'ANALYST',
    FinanceManager: 'FINANCE_MANAGER',
    FinanceEdit: 'FINANCE_EDIT',
    FinanceView: 'FINANCE_VIEW',
    AudienceManager: 'AUDIENCE_MANAGER',
    CampaignManager: 'CAMPAIGN_MANAGER',
    CatalogsManager: 'CATALOGS_MANAGER',
    CatalogsViewer: 'CATALOGS_VIEWER',
    ProfilePublisher: 'PROFILE_PUBLISHER',
    ConsumerUser: 'CONSUMER_USER',
    BizPinnerListSharer: 'BIZ_PINNER_LIST_SHARER'
} as const;
export type Permissions = typeof Permissions[keyof typeof Permissions];


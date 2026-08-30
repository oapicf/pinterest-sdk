

/**
 * Permission levels including the OWNER role.
 */
export const PermissionsWithOwner = {
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
    Owner: 'OWNER'
} as const;
export type PermissionsWithOwner = typeof PermissionsWithOwner[keyof typeof PermissionsWithOwner];


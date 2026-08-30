

/**
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */
export const Role = {
    Unknown: 'UNKNOWN',
    Owner: 'OWNER',
    Admin: 'ADMIN',
    Analyst: 'ANALYST',
    SosReader: 'SOS_READER',
    FinanceManager: 'FINANCE_MANAGER',
    FinanceEdit: 'FINANCE_EDIT',
    FinanceView: 'FINANCE_VIEW',
    AudienceManager: 'AUDIENCE_MANAGER',
    CampaignManager: 'CAMPAIGN_MANAGER',
    CatalogsManager: 'CATALOGS_MANAGER',
    CatalogsViewer: 'CATALOGS_VIEWER',
    RestrictedOwner: 'RESTRICTED_OWNER',
    ProfileManager: 'PROFILE_MANAGER',
    ProfilePublisher: 'PROFILE_PUBLISHER',
    ResourcePinnerListOwner: 'RESOURCE_PINNER_LIST_OWNER',
    ResourcePinnerListReader: 'RESOURCE_PINNER_LIST_READER',
    BizPinnerListSharer: 'BIZ_PINNER_LIST_SHARER',
    ResourceConversionTagsReader: 'RESOURCE_CONVERSION_TAGS_READER'
} as const;
export type Role = typeof Role[keyof typeof Role];


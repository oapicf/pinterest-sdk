

/**
 * Permission role for business access.
 */
export const BusinessAccessRole = {
    Owner: 'OWNER',
    Admin: 'ADMIN',
    Analyst: 'ANALYST',
    SosReader: 'SOS_READER',
    FinanceManager: 'FINANCE_MANAGER',
    FinanceView: 'FINANCE_VIEW',
    FinanceEdit: 'FINANCE_EDIT',
    AudienceManager: 'AUDIENCE_MANAGER',
    CampaignManager: 'CAMPAIGN_MANAGER',
    CatalogsManager: 'CATALOGS_MANAGER',
    RestrictedOwner: 'RESTRICTED_OWNER',
    ProfileManager: 'PROFILE_MANAGER',
    ProfilePublisher: 'PROFILE_PUBLISHER',
    ResourcePinnerListOwner: 'RESOURCE_PINNER_LIST_OWNER',
    ResourcePinnerListReader: 'RESOURCE_PINNER_LIST_READER',
    BizPinnerListSharer: 'BIZ_PINNER_LIST_SHARER',
    ResourceConversionTagsReader: 'RESOURCE_CONVERSION_TAGS_READER'
} as const;
export type BusinessAccessRole = typeof BusinessAccessRole[keyof typeof BusinessAccessRole];


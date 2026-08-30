

/**
 * Summary status for ad group
 */
export const AdGroupSummaryStatus = {
    Running: 'RUNNING',
    Paused: 'PAUSED',
    NotStarted: 'NOT_STARTED',
    Completed: 'COMPLETED',
    AdvertiserDisabled: 'ADVERTISER_DISABLED',
    Archived: 'ARCHIVED',
    Draft: 'DRAFT',
    DeletedDraft: 'DELETED_DRAFT'
} as const;
export type AdGroupSummaryStatus = typeof AdGroupSummaryStatus[keyof typeof AdGroupSummaryStatus];


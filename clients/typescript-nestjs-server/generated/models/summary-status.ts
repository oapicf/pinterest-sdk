

/**
 * Summary status for campaign
 */
export const SummaryStatus = {
    Running: 'RUNNING',
    Paused: 'PAUSED',
    NotStarted: 'NOT_STARTED',
    Completed: 'COMPLETED',
    AdvertiserDisabled: 'ADVERTISER_DISABLED',
    Archived: 'ARCHIVED',
    Draft: 'DRAFT',
    DeletedDraft: 'DELETED_DRAFT'
} as const;
export type SummaryStatus = typeof SummaryStatus[keyof typeof SummaryStatus];


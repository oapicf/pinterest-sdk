

export const CampaignSummaryStatus = {
    Running: 'RUNNING',
    Paused: 'PAUSED',
    NotStarted: 'NOT_STARTED',
    Completed: 'COMPLETED',
    AdvertiserDisabled: 'ADVERTISER_DISABLED',
    Archived: 'ARCHIVED',
    Draft: 'DRAFT',
    DeletedDraft: 'DELETED_DRAFT'
} as const;
export type CampaignSummaryStatus = typeof CampaignSummaryStatus[keyof typeof CampaignSummaryStatus];


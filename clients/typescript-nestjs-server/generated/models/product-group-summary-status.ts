

/**
 * Summary status for product group
 */
export const ProductGroupSummaryStatus = {
    Running: 'RUNNING',
    Paused: 'PAUSED',
    Excluded: 'EXCLUDED',
    Archived: 'ARCHIVED'
} as const;
export type ProductGroupSummaryStatus = typeof ProductGroupSummaryStatus[keyof typeof ProductGroupSummaryStatus];


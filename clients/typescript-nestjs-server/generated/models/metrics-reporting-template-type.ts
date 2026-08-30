

/**
 * Reporting template type
 */
export const MetricsReportingTemplateType = {
    Unspecified: 'UNSPECIFIED',
    Bulk: 'BULK',
    Overview: 'OVERVIEW',
    Table: 'TABLE',
    Mmm: 'MMM',
    BrandCategory: 'BRAND_CATEGORY'
} as const;
export type MetricsReportingTemplateType = typeof MetricsReportingTemplateType[keyof typeof MetricsReportingTemplateType];


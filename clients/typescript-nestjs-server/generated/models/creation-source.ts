

/**
 * The source of conversion events ingestion
 */
export const CreationSource = {
    AdsApi: 'ADS_API',
    AdsManagerReportingPage: 'ADS_MANAGER_REPORTING_PAGE',
    AdsManagerReportBuilder: 'ADS_MANAGER_REPORT_BUILDER'
} as const;
export type CreationSource = typeof CreationSource[keyof typeof CreationSource];


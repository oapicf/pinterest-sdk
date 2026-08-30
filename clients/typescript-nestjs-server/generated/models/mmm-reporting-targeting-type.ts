

/**
 * Ad targeting types for MMM report
 */
export const MMMReportingTargetingType = {
    Apptype: 'APPTYPE',
    Country: 'COUNTRY',
    CreativeType: 'CREATIVE_TYPE',
    Gender: 'GENDER',
    Location: 'LOCATION',
    Placement: 'PLACEMENT',
    AudienceInclude: 'AUDIENCE_INCLUDE'
} as const;
export type MMMReportingTargetingType = typeof MMMReportingTargetingType[keyof typeof MMMReportingTargetingType];


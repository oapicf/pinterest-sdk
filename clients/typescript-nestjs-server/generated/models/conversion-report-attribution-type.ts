

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */
export const ConversionReportAttributionType = {
    Individual: 'INDIVIDUAL',
    Household: 'HOUSEHOLD'
} as const;
export type ConversionReportAttributionType = typeof ConversionReportAttributionType[keyof typeof ConversionReportAttributionType];


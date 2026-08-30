

/**
 * Conversion report time type
 */
export const ConversionReportTimeType = {
    TimeOfAdAction: 'TIME_OF_AD_ACTION',
    TimeOfConversion: 'TIME_OF_CONVERSION'
} as const;
export type ConversionReportTimeType = typeof ConversionReportTimeType[keyof typeof ConversionReportTimeType];


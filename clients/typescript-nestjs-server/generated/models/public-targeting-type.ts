

/**
 * Public ad targeting type with external names
 */
export const PublicTargetingType = {
    Apptype: 'APPTYPE',
    Gender: 'GENDER',
    Locale: 'LOCALE',
    AgeBucket: 'AGE_BUCKET',
    Location: 'LOCATION',
    Geo: 'GEO',
    Interest: 'INTEREST',
    Keyword: 'KEYWORD',
    AudienceInclude: 'AUDIENCE_INCLUDE',
    AudienceExclude: 'AUDIENCE_EXCLUDE'
} as const;
export type PublicTargetingType = typeof PublicTargetingType[keyof typeof PublicTargetingType];


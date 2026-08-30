

/**
 * Method used to verify website ownership.
 */
export const WebsiteVerificationMethod = {
    Filename: 'FILENAME',
    Metatag: 'METATAG',
    Dnstxt: 'DNSTXT'
} as const;
export type WebsiteVerificationMethod = typeof WebsiteVerificationMethod[keyof typeof WebsiteVerificationMethod];


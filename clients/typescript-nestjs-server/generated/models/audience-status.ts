

/**
 * Audience processing status
 */
export const AudienceStatus = {
    Initializing: 'INITIALIZING',
    Ready: 'READY',
    TooSmall: 'TOO_SMALL',
    Eligible: 'ELIGIBLE',
    PersonasIneligibleSize: 'PERSONAS_INELIGIBLE_SIZE',
    PersonasInitializing: 'PERSONAS_INITIALIZING'
} as const;
export type AudienceStatus = typeof AudienceStatus[keyof typeof AudienceStatus];


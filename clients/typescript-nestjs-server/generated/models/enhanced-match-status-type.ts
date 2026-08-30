

export const EnhancedMatchStatusType = {
    Unknown: 'UNKNOWN',
    NotValidated: 'NOT_VALIDATED',
    ValidatingInProgress: 'VALIDATING_IN_PROGRESS',
    ValidationComplete: 'VALIDATION_COMPLETE'
} as const;
export type EnhancedMatchStatusType = typeof EnhancedMatchStatusType[keyof typeof EnhancedMatchStatusType];


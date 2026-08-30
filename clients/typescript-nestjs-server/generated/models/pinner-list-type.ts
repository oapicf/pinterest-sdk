

/**
 * Audience type
 */
export const PinnerListType = {
    CustomerList: 'CUSTOMER_LIST',
    Visitor: 'VISITOR',
    Engagement: 'ENGAGEMENT',
    Lookalike: 'LOOKALIKE',
    Actalike: 'ACTALIKE',
    Persona: 'PERSONA'
} as const;
export type PinnerListType = typeof PinnerListType[keyof typeof PinnerListType];


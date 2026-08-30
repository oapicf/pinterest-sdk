

/**
 * Audience type
 */
export const AudienceType = {
    CustomerList: 'CUSTOMER_LIST',
    Visitor: 'VISITOR',
    Engagement: 'ENGAGEMENT',
    Actalike: 'ACTALIKE',
    Persona: 'PERSONA'
} as const;
export type AudienceType = typeof AudienceType[keyof typeof AudienceType];


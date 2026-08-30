

/**
 * Status of the lead form
 */
export const LeadFormStatus = {
    Draft: 'DRAFT',
    Active: 'ACTIVE'
} as const;
export type LeadFormStatus = typeof LeadFormStatus[keyof typeof LeadFormStatus];




/**
 * The names of fields that business accounts are searched by
 */
export const BusinessSearchBy = {
    FullName: 'FULL_NAME',
    Username: 'USERNAME',
    BusinessId: 'BUSINESS_ID',
    Email: 'EMAIL'
} as const;
export type BusinessSearchBy = typeof BusinessSearchBy[keyof typeof BusinessSearchBy];


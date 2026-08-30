

export const UserAccountType = {
    Pinner: 'PINNER',
    Business: 'BUSINESS'
} as const;
export type UserAccountType = typeof UserAccountType[keyof typeof UserAccountType];


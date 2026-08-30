

export const BoardPrivacyFilter = {
    All: 'ALL',
    Public: 'PUBLIC',
    Protected: 'PROTECTED',
    Secret: 'SECRET',
    PublicAndSecret: 'PUBLIC_AND_SECRET'
} as const;
export type BoardPrivacyFilter = typeof BoardPrivacyFilter[keyof typeof BoardPrivacyFilter];


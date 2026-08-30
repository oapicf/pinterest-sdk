

export const BoardPrivacy = {
    Public: 'PUBLIC',
    Protected: 'PROTECTED',
    Secret: 'SECRET'
} as const;
export type BoardPrivacy = typeof BoardPrivacy[keyof typeof BoardPrivacy];


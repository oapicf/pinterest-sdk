

export const BoardUpdatePrivacy = {
    Public: 'PUBLIC',
    Secret: 'SECRET'
} as const;
export type BoardUpdatePrivacy = typeof BoardUpdatePrivacy[keyof typeof BoardUpdatePrivacy];




/**
 * Specifies the type of followees to be kept when filtering them.
 */
export const UserFollowingFeedType = {
    All: 'ALL',
    Ranked: 'RANKED',
    CreatorOnly: 'CREATOR_ONLY',
    RankedCreatorOnly: 'RANKED_CREATOR_ONLY'
} as const;
export type UserFollowingFeedType = typeof UserFollowingFeedType[keyof typeof UserFollowingFeedType];


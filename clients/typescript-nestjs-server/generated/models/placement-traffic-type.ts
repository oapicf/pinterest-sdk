

/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */
export const PlacementTrafficType = {
    All: 'ALL',
    TwoColumnFeed: 'TWO_COLUMN_FEED',
    FullscreenFeed: 'FULLSCREEN_FEED'
} as const;
export type PlacementTrafficType = typeof PlacementTrafficType[keyof typeof PlacementTrafficType];




/**
 * Pin metric type for multi-pin analytics
 */
export const MultiPinsAnalyticsMetricTypesItem = {
    Impression: 'IMPRESSION',
    OutboundClick: 'OUTBOUND_CLICK',
    PinClick: 'PIN_CLICK',
    Save: 'SAVE',
    SaveRate: 'SAVE_RATE',
    TotalComments: 'TOTAL_COMMENTS',
    TotalReactions: 'TOTAL_REACTIONS',
    UserFollow: 'USER_FOLLOW',
    ProfileVisit: 'PROFILE_VISIT',
    VideoMrcView: 'VIDEO_MRC_VIEW',
    Video10SView: 'VIDEO_10S_VIEW',
    Quartile95PercentView: 'QUARTILE_95_PERCENT_VIEW',
    VideoV50WatchTime: 'VIDEO_V50_WATCH_TIME',
    VideoStart: 'VIDEO_START',
    VideoAvgWatchTime: 'VIDEO_AVG_WATCH_TIME'
} as const;
export type MultiPinsAnalyticsMetricTypesItem = typeof MultiPinsAnalyticsMetricTypesItem[keyof typeof MultiPinsAnalyticsMetricTypesItem];


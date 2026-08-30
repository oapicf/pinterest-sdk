

export const QueryvideopinmetrictypesItems = {
    Impression: 'IMPRESSION',
    Save: 'SAVE',
    VideoMrcView: 'VIDEO_MRC_VIEW',
    VideoAvgWatchTime: 'VIDEO_AVG_WATCH_TIME',
    VideoV50WatchTime: 'VIDEO_V50_WATCH_TIME',
    Quartile95PercentView: 'QUARTILE_95_PERCENT_VIEW',
    Video10SView: 'VIDEO_10S_VIEW',
    VideoStart: 'VIDEO_START',
    OutboundClick: 'OUTBOUND_CLICK'
} as const;
export type QueryvideopinmetrictypesItems = typeof QueryvideopinmetrictypesItems[keyof typeof QueryvideopinmetrictypesItems];


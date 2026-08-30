

/**
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 */
export const ActionType = {
    Clickthrough: 'CLICKTHROUGH',
    Impression: 'IMPRESSION',
    VideoV50Mrc: 'VIDEO_V_50_MRC'
} as const;
export type ActionType = typeof ActionType[keyof typeof ActionType];


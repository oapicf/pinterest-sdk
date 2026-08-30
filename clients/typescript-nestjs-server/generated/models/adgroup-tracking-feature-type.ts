

export const AdgroupTrackingFeatureType = {
    Trends: 'TRENDS',
    CloneMeta: 'CLONE_META',
    BulkEditor: 'BULK_EDITOR',
    AdRotation: 'AD_ROTATION'
} as const;
export type AdgroupTrackingFeatureType = typeof AdgroupTrackingFeatureType[keyof typeof AdgroupTrackingFeatureType];


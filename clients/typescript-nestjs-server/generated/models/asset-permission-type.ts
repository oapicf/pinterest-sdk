

/**
 * Permission aggregation type for asset access
 */
export const AssetPermissionType = {
    AggregatedPermission: 'AGGREGATED_PERMISSION',
    DirectPermission: 'DIRECT_PERMISSION'
} as const;
export type AssetPermissionType = typeof AssetPermissionType[keyof typeof AssetPermissionType];


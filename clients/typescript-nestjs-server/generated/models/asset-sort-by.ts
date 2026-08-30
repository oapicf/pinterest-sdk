

/**
 * The field to sort member assets by
 */
export const AssetSortBy = {
    Name: 'NAME',
    Id: 'ID',
    Permissions: 'PERMISSIONS'
} as const;
export type AssetSortBy = typeof AssetSortBy[keyof typeof AssetSortBy];


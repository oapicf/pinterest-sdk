

/**
 * The field to search member assets by
 */
export const AssetSearchBy = {
    Name: 'NAME',
    Id: 'ID',
    NameOrId: 'NAME_OR_ID',
    OwnerName: 'OWNER_NAME',
    NameOrOwner: 'NAME_OR_OWNER'
} as const;
export type AssetSearchBy = typeof AssetSearchBy[keyof typeof AssetSearchBy];


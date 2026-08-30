

/**
 * The name of field that businesses are sorted by
 */
export const BusinessMemberSortBy = {
    FullName: 'FULL_NAME',
    BusinessRoles: 'BUSINESS_ROLES',
    CreatedTime: 'CREATED_TIME'
} as const;
export type BusinessMemberSortBy = typeof BusinessMemberSortBy[keyof typeof BusinessMemberSortBy];




/**
 * The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 */
export const BusinessRoleForMembers = {
    Employee: 'EMPLOYEE',
    BizAdmin: 'BIZ_ADMIN'
} as const;
export type BusinessRoleForMembers = typeof BusinessRoleForMembers[keyof typeof BusinessRoleForMembers];


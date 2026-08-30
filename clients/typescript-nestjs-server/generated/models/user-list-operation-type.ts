

/**
 * User list operation type (add or remove)
 */
export const UserListOperationType = {
    Add: 'ADD',
    Remove: 'REMOVE'
} as const;
export type UserListOperationType = typeof UserListOperationType[keyof typeof UserListOperationType];




/**
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */
export const OperationType = {
    Share: 'SHARE',
    Revoke: 'REVOKE'
} as const;
export type OperationType = typeof OperationType[keyof typeof OperationType];


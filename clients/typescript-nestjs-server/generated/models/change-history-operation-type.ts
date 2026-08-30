

export const ChangeHistoryOperationType = {
    Create: 'CREATE',
    Update: 'UPDATE',
    Delete: 'DELETE'
} as const;
export type ChangeHistoryOperationType = typeof ChangeHistoryOperationType[keyof typeof ChangeHistoryOperationType];


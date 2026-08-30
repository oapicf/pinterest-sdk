

/**
 * User list type
 */
export const UserListType = {
    Email: 'EMAIL',
    Idfa: 'IDFA',
    Maid: 'MAID',
    LrId: 'LR_ID',
    DlxId: 'DLX_ID',
    HashedPinnerId: 'HASHED_PINNER_ID'
} as const;
export type UserListType = typeof UserListType[keyof typeof UserListType];




/**
 * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
 */
export const CustomerListStatus = {
    Processing: 'PROCESSING',
    Ready: 'READY',
    TooSmall: 'TOO_SMALL',
    Uploading: 'UPLOADING'
} as const;
export type CustomerListStatus = typeof CustomerListStatus[keyof typeof CustomerListStatus];


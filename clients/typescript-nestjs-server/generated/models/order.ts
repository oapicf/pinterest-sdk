

export const Order = {
    Ascending: 'ASCENDING',
    Descending: 'DESCENDING'
} as const;
export type Order = typeof Order[keyof typeof Order];


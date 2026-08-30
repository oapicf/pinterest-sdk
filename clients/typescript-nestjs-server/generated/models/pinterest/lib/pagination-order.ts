

export const PinterestLibPaginationOrder = {
    Ascending: 'ASCENDING',
    Descending: 'DESCENDING'
} as const;
export type PinterestLibPaginationOrder = typeof PinterestLibPaginationOrder[keyof typeof PinterestLibPaginationOrder];


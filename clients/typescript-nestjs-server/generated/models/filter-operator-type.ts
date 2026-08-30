

export const FilterOperatorType = {
    Is: 'IS',
    Contains: 'CONTAINS'
} as const;
export type FilterOperatorType = typeof FilterOperatorType[keyof typeof FilterOperatorType];


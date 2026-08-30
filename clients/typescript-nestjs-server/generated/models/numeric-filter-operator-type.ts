

export const NumericFilterOperatorType = {
    GreaterThan: 'GREATER_THAN',
    GreaterThanOrEquals: 'GREATER_THAN_OR_EQUALS',
    LessThan: 'LESS_THAN',
    LessThanOrEquals: 'LESS_THAN_OR_EQUALS'
} as const;
export type NumericFilterOperatorType = typeof NumericFilterOperatorType[keyof typeof NumericFilterOperatorType];


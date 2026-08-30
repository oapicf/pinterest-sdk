

export const TargetingSpecListOperation = {
    Set: 'SET',
    Add: 'ADD',
    Remove: 'REMOVE'
} as const;
export type TargetingSpecListOperation = typeof TargetingSpecListOperation[keyof typeof TargetingSpecListOperation];


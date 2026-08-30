

/**
 * The schedule action
 */
export const ScheduleAction = {
    IncreaseByValue: 'INCREASE_BY_VALUE',
    IncreaseByPercent: 'INCREASE_BY_PERCENT'
} as const;
export type ScheduleAction = typeof ScheduleAction[keyof typeof ScheduleAction];


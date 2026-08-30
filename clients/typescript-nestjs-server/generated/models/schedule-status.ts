

/**
 * Schedule status
 */
export const ScheduleStatus = {
    Draft: 'DRAFT',
    Created: 'CREATED',
    Scheduled: 'SCHEDULED',
    Active: 'ACTIVE',
    Completed: 'COMPLETED',
    Failed: 'FAILED',
    Canceled: 'CANCELED'
} as const;
export type ScheduleStatus = typeof ScheduleStatus[keyof typeof ScheduleStatus];


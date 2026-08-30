

/**
 * Workload processing state
 */
export const WorkloadState = {
    NotStarted: 'NOT_STARTED',
    Running: 'RUNNING',
    Paused: 'PAUSED',
    Succeeded: 'SUCCEEDED',
    Failed: 'FAILED'
} as const;
export type WorkloadState = typeof WorkloadState[keyof typeof WorkloadState];


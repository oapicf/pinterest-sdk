

/**
 * Status of a single event in the response.
 */
export const EventProcessingStatus = {
    Failed: 'failed',
    Processed: 'processed'
} as const;
export type EventProcessingStatus = typeof EventProcessingStatus[keyof typeof EventProcessingStatus];


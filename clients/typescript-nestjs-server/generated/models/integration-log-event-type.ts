

/**
 * Log event type for integration applications.
 */
export const IntegrationLogEventType = {
    App: 'APP',
    Api: 'API'
} as const;
export type IntegrationLogEventType = typeof IntegrationLogEventType[keyof typeof IntegrationLogEventType];


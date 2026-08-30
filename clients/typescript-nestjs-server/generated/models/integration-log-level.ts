

/**
 * Log level type for integration applications.
 */
export const IntegrationLogLevel = {
    Info: 'INFO',
    Warn: 'WARN',
    Error: 'ERROR'
} as const;
export type IntegrationLogLevel = typeof IntegrationLogLevel[keyof typeof IntegrationLogLevel];


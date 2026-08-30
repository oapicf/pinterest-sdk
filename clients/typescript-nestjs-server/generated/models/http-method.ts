

/**
 * HTTP request method.
 */
export const HttpMethod = {
    Get: 'GET',
    Head: 'HEAD',
    Post: 'POST',
    Put: 'PUT',
    Delete: 'DELETE',
    Connect: 'CONNECT',
    Options: 'OPTIONS',
    Trace: 'TRACE',
    Patch: 'PATCH'
} as const;
export type HttpMethod = typeof HttpMethod[keyof typeof HttpMethod];


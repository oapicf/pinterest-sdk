

/**
 * The type of OAuth grant being requested.
 */
export const TokenGrantType = {
    AuthorizationCode: 'authorization_code',
    RefreshToken: 'refresh_token',
    ClientCredentials: 'client_credentials'
} as const;
export type TokenGrantType = typeof TokenGrantType[keyof typeof TokenGrantType];


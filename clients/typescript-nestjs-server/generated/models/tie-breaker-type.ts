

/**
 * Quiz ad tie breaker type, default is RANDOM
 */
export const TieBreakerType = {
    Random: 'RANDOM',
    Custom: 'CUSTOM'
} as const;
export type TieBreakerType = typeof TieBreakerType[keyof typeof TieBreakerType];


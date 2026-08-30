

/**
 * Keyword match type
 */
export const MatchTypeResponse = {
    Broad: 'BROAD',
    Phrase: 'PHRASE',
    Exact: 'EXACT',
    ExactNegative: 'EXACT_NEGATIVE',
    PhraseNegative: 'PHRASE_NEGATIVE'
} as const;
export type MatchTypeResponse = typeof MatchTypeResponse[keyof typeof MatchTypeResponse];




/**
 * Keyword match type
 */
export const MatchType = {
    Broad: 'BROAD',
    Phrase: 'PHRASE',
    Exact: 'EXACT',
    ExactNegative: 'EXACT_NEGATIVE',
    PhraseNegative: 'PHRASE_NEGATIVE'
} as const;
export type MatchType = typeof MatchType[keyof typeof MatchType];




/**
 * Keyword match type allowing null
 */
export const NullalbleMatchType = {
    Broad: 'BROAD',
    Phrase: 'PHRASE',
    Exact: 'EXACT',
    ExactNegative: 'EXACT_NEGATIVE',
    PhraseNegative: 'PHRASE_NEGATIVE'
} as const;
export type NullalbleMatchType = typeof NullalbleMatchType[keyof typeof NullalbleMatchType];


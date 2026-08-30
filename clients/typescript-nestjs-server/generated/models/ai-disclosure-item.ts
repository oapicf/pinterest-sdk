

/**
 * AI disclosure declaration the creator has made about the Pin.
 */
export const AiDisclosureItem = {
    AiModified: 'AI_MODIFIED',
    SyntheticPerformer: 'SYNTHETIC_PERFORMER'
} as const;
export type AiDisclosureItem = typeof AiDisclosureItem[keyof typeof AiDisclosureItem];


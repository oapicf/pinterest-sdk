

/**
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */
export const CatalogsAiContentDisclosureLabel = {
    AiModified: 'ai_modified',
    SyntheticPerformer: 'synthetic_performer'
} as const;
export type CatalogsAiContentDisclosureLabel = typeof CatalogsAiContentDisclosureLabel[keyof typeof CatalogsAiContentDisclosureLabel];


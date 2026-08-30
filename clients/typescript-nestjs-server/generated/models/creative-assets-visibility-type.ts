

/**
 * Creative assets visibility.
 */
export const CreativeAssetsVisibilityType = {
    Visible: 'VISIBLE',
    Hidden: 'HIDDEN'
} as const;
export type CreativeAssetsVisibilityType = typeof CreativeAssetsVisibilityType[keyof typeof CreativeAssetsVisibilityType];


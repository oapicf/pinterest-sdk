

/**
 * Operating system family.
 */
export const OsFamily = {
    Ios: 'ios',
    Android: 'android',
    Macos: 'macos',
    Windows: 'windows',
    Linux: 'linux',
    Bsd: 'bsd',
    Other: 'other'
} as const;
export type OsFamily = typeof OsFamily[keyof typeof OsFamily];


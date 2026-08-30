

/**
 * Platform options for AppsFlyer audience
 */
export const AppsflyerPlatform = {
    Android: 'android',
    Ios: 'ios'
} as const;
export type AppsflyerPlatform = typeof AppsflyerPlatform[keyof typeof AppsflyerPlatform];


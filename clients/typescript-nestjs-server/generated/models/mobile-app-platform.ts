

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
 */
export const MobileAppPlatform = {
    Ios: 'IOS',
    Android: 'ANDROID'
} as const;
export type MobileAppPlatform = typeof MobileAppPlatform[keyof typeof MobileAppPlatform];




export const TargetingSpecAppType = {
    AndroidMobile: 'android_mobile',
    AndroidTablet: 'android_tablet',
    Ipad: 'ipad',
    Iphone: 'iphone',
    Web: 'web',
    WebMobile: 'web_mobile'
} as const;
export type TargetingSpecAppType = typeof TargetingSpecAppType[keyof typeof TargetingSpecAppType];


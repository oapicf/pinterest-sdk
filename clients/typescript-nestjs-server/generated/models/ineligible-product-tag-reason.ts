

/**
 * Reason why a product pin is ineligible for tagging.
 */
export const IneligibleProductTagReason = {
    PinMissing: 'PIN_MISSING',
    PinIsPrivate: 'PIN_IS_PRIVATE',
    ProductMetadataMissing: 'PRODUCT_METADATA_MISSING',
    PinNotFromVerifiedDomain: 'PIN_NOT_FROM_VERIFIED_DOMAIN',
    PinNotFromSameUserAsHeroPin: 'PIN_NOT_FROM_SAME_USER_AS_HERO_PIN'
} as const;
export type IneligibleProductTagReason = typeof IneligibleProductTagReason[keyof typeof IneligibleProductTagReason];


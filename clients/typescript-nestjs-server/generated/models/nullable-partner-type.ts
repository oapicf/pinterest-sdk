

export const NullablePartnerType = {
    Internal: 'INTERNAL',
    External: 'EXTERNAL'
} as const;
export type NullablePartnerType = typeof NullablePartnerType[keyof typeof NullablePartnerType];


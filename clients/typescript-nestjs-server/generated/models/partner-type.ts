

export const PartnerType = {
    Internal: 'INTERNAL',
    External: 'EXTERNAL'
} as const;
export type PartnerType = typeof PartnerType[keyof typeof PartnerType];


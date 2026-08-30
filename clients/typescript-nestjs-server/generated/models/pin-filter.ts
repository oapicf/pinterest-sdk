

export const PinFilter = {
    ExcludeNative: 'exclude_native',
    ExcludeRepins: 'exclude_repins',
    HasBeenPromoted: 'has_been_promoted'
} as const;
export type PinFilter = typeof PinFilter[keyof typeof PinFilter];


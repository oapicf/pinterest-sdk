

export const ConversionAttributionWindowDays = {
    NUMBER_0: 0,
    NUMBER_1: 1,
    NUMBER_7: 7,
    NUMBER_14: 14,
    NUMBER_30: 30,
    NUMBER_60: 60
} as const;
export type ConversionAttributionWindowDays = typeof ConversionAttributionWindowDays[keyof typeof ConversionAttributionWindowDays];


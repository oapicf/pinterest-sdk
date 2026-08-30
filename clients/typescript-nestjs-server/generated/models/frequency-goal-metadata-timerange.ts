

export const FrequencyGoalMetadataTimerange = {
    ThirtyDay: 'THIRTY_DAY',
    Day: 'DAY',
    SevenDay: 'SEVEN_DAY',
    TwentyMinute: 'TWENTY_MINUTE',
    TenMinute: 'TEN_MINUTE',
    TwentyFourHour: 'TWENTY_FOUR_HOUR'
} as const;
export type FrequencyGoalMetadataTimerange = typeof FrequencyGoalMetadataTimerange[keyof typeof FrequencyGoalMetadataTimerange];


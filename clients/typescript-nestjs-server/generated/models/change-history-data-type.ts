

export const ChangeHistoryDataType = {
    String: 'STRING',
    Numeric: 'NUMERIC',
    Microcurrency: 'MICROCURRENCY',
    Date: 'DATE',
    Bool: 'BOOL',
    GenderList: 'GENDER_LIST',
    AgeBucketList: 'AGE_BUCKET_LIST',
    ApptypeList: 'APPTYPE_LIST',
    CountryList: 'COUNTRY_LIST',
    LocaleList: 'LOCALE_LIST'
} as const;
export type ChangeHistoryDataType = typeof ChangeHistoryDataType[keyof typeof ChangeHistoryDataType];


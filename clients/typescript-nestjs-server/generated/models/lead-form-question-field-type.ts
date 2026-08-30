

/**
 * Lead form question field type
 */
export const LeadFormQuestionFieldType = {
    TextField: 'TEXT_FIELD',
    TextArea: 'TEXT_AREA',
    RadioList: 'RADIO_LIST',
    Checkbox: 'CHECKBOX'
} as const;
export type LeadFormQuestionFieldType = typeof LeadFormQuestionFieldType[keyof typeof LeadFormQuestionFieldType];


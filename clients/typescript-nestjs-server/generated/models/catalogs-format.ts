

/**
 * The file format of a feed.
 */
export const CatalogsFormat = {
    Tsv: 'TSV',
    Csv: 'CSV',
    Xml: 'XML',
    Integration: 'INTEGRATION'
} as const;
export type CatalogsFormat = typeof CatalogsFormat[keyof typeof CatalogsFormat];


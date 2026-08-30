

/**
 * The type of an SSIO order line.
 */
export const SSIOOrderLineType = {
    Budget: 'BUDGET',
    Perpetuals: 'PERPETUALS'
} as const;
export type SSIOOrderLineType = typeof SSIOOrderLineType[keyof typeof SSIOOrderLineType];


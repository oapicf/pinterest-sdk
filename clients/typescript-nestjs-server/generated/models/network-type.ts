

/**
 * Type of network connection.
 */
export const NetworkType = {
    Wifi: 'wifi',
    Cellular2g: 'cellular_2g',
    Cellular3g: 'cellular_3g',
    Cellular4g: 'cellular_4g',
    Cellular5g: 'cellular_5g',
    Cellular6g: 'cellular_6g',
    Ethernet: 'ethernet',
    Unknown: 'unknown'
} as const;
export type NetworkType = typeof NetworkType[keyof typeof NetworkType];


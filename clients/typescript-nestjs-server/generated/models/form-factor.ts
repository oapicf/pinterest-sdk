

/**
 * Device form factor
 */
export const FormFactor = {
    Desktop: 'desktop',
    Laptop: 'laptop',
    Cellphone: 'cellphone',
    Tablet: 'tablet',
    Smartwatch: 'smartwatch',
    Tv: 'tv',
    Vr: 'vr',
    Console: 'console',
    Other: 'other'
} as const;
export type FormFactor = typeof FormFactor[keyof typeof FormFactor];


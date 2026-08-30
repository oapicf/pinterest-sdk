

export const TrendsSupportedRegion = {
    Us: 'US',
    Ca: 'CA',
    De: 'DE',
    Fr: 'FR',
    Es: 'ES',
    It: 'IT',
    Deatch: 'DE+AT+CH',
    Gbie: 'GB+IE',
    Itesptgrmt: 'IT+ES+PT+GR+MT',
    Plrohuskcz: 'PL+RO+HU+SK+CZ',
    Sedkfino: 'SE+DK+FI+NO',
    Nlbelu: 'NL+BE+LU',
    Ar: 'AR',
    Br: 'BR',
    Co: 'CO',
    Mx: 'MX',
    Mxarcocl: 'MX+AR+CO+CL',
    Aunz: 'AU+NZ'
} as const;
export type TrendsSupportedRegion = typeof TrendsSupportedRegion[keyof typeof TrendsSupportedRegion];


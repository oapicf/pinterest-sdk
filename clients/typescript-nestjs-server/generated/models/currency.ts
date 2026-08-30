

/**
 * Currency Codes from ISO 4217
 */
export const Currency = {
    Unk: 'UNK',
    Usd: 'USD',
    Gbp: 'GBP',
    Cad: 'CAD',
    Eur: 'EUR',
    Aud: 'AUD',
    Nzd: 'NZD',
    Sek: 'SEK',
    Ils: 'ILS',
    Chf: 'CHF',
    Hkd: 'HKD',
    Jpy: 'JPY',
    Sgd: 'SGD',
    Krw: 'KRW',
    Nok: 'NOK',
    Dkk: 'DKK',
    Pln: 'PLN',
    Ron: 'RON',
    Huf: 'HUF',
    Czk: 'CZK',
    Brl: 'BRL',
    Mxn: 'MXN',
    Ars: 'ARS',
    Clp: 'CLP',
    Cop: 'COP',
    Inr: 'INR',
    Try: 'TRY'
} as const;
export type Currency = typeof Currency[keyof typeof Currency];


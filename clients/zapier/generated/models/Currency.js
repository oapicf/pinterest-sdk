const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Currency Codes from ISO 4217 - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNK',
                    'USD',
                    'GBP',
                    'CAD',
                    'EUR',
                    'AUD',
                    'NZD',
                    'SEK',
                    'ILS',
                    'CHF',
                    'HKD',
                    'JPY',
                    'SGD',
                    'KRW',
                    'NOK',
                    'DKK',
                    'PLN',
                    'RON',
                    'HUF',
                    'CZK',
                    'BRL',
                    'MXN',
                    'ARS',
                    'CLP',
                    'COP',
                    'INR',
                    'TRY',
                ],
            }
        )
    }

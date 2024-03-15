const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Advertiser's ISO two character country code. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'US',
                    'GB',
                    'CA',
                    'IE',
                    'AU',
                    'NZ',
                    'FR',
                    'SE',
                    'IL',
                    'DE',
                    'AT',
                    'IT',
                    'ES',
                    'NL',
                    'BE',
                    'PT',
                    'CH',
                    'HK',
                    'JP',
                    'KR',
                    'SG',
                    'NO',
                    'DK',
                    'FI',
                    'CY',
                    'LU',
                    'MT',
                    'PL',
                    'RO',
                    'HU',
                    'CZ',
                    'GR',
                    'SK',
                    'BR',
                    'MX',
                    'AR',
                    'CL',
                    'CO',
                ],
            }
        )
    }

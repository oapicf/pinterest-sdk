const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'US',
                    'CA',
                    'DE',
                    'FR',
                    'ES',
                    'IT',
                    'DE+AT+CH',
                    'GB+IE',
                    'IT+ES+PT+GR+MT',
                    'PL+RO+HU+SK+CZ',
                    'SE+DK+FI+NO',
                    'NL+BE+LU',
                    'AR',
                    'BR',
                    'CO',
                    'MX',
                    'MX+AR+CO+CL',
                    'AU+NZ',
                ],
            }
        )
    }

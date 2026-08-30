const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of the credit card. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN',
                    'VISA',
                    'MASTERCARD',
                    'AMERICAN_EXPRESS',
                    'DISCOVER',
                    'ELO',
                ],
            }
        )
    }

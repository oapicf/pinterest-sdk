const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Brand of the payment method. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN',
                    'VISA',
                    'MASTERCARD',
                    'AMERICAN_EXPRESS',
                    'DISCOVER',
                    'SOFORT',
                    'DINERS_CLUB',
                    'ELO',
                    'CARTE_BANCAIRE',
                ],
            }
        )
    }

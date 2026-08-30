const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Advertisers billing type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CREDIT_CARD',
                    'INVOICE',
                    'INTERNAL',
                    'RECURRING',
                    'PREPAID',
                ],
            }
        )
    }

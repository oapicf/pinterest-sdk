const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The type of a billing invoice document. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'INVOICE',
                    'CREDIT_MEMO',
                ],
            }
        )
    }

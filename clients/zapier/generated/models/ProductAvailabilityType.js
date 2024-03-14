const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Default availability for products in a feed. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IN_STOCK',
                    'OUT_OF_STOCK',
                    'PREORDER',
                    '',
                ],
            }
        )
    }

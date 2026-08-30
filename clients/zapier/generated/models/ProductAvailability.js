const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Product availability. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IN_STOCK',
                    'OUT_OF_STOCK',
                    'PREORDER',
                ],
            }
        )
    }

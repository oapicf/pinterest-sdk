const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Availability of the item - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'in stock',
                    'out of stock',
                    'preorder',
                ],
            }
        )
    }

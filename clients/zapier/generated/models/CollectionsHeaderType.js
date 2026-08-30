const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Collections ad header type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SHOP_THIS_COLLECTION',
                    'EXPLORE_THIS_COLLECTION',
                    'NO_HEADER',
                    'ON_SALE',
                    'GET_DEAL',
                    '',
                ],
            }
        )
    }

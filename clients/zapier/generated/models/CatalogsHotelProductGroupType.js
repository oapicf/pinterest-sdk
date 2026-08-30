const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Catalog hotel product group type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'MERCHANT_CREATED',
                    'ALL_LISTINGS',
                ],
            }
        )
    }

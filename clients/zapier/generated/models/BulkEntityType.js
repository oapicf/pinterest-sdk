const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Refers ads entity type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CAMPAIGN',
                    'AD_GROUP',
                    'PRODUCT_GROUP',
                    'AD',
                    'KEYWORD',
                ],
            }
        )
    }

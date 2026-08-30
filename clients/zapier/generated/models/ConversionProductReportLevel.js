const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Level of the report - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ADVERTISER',
                    'CAMPAIGN',
                    'AD_GROUP',
                ],
            }
        )
    }

const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Specify the entity type to get summary information - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ADVERTISER',
                    'CAMPAIGN',
                    'AD_GROUP',
                    'AD',
                ],
            }
        )
    }

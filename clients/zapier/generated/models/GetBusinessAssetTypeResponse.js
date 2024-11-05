const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of asset. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AD_ACCOUNT',
                    'PROFILE',
                    'ASSET_GROUP',
                    'CONVERSION_TAG',
                ],
            }
        )
    }

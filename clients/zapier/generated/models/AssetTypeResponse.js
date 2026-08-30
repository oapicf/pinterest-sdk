const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AD_ACCOUNT',
                    'MERCHANT',
                    'PROFILE',
                    'ASSET_GROUP',
                    'PINNER_LIST',
                    'CONVERSION_TAG',
                    'CATALOG',
                    'CONVERSION_SEGMENT',
                ],
            }
        )
    }

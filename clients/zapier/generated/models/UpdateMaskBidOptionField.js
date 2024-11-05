const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `bid option field to apply operation updates to - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BID',
                    'APP_TYPE_BID_MULTIPLIER_SET',
                    'PLACEMENT_BID_MULTIPLIER_SET',
                ],
            }
        )
    }

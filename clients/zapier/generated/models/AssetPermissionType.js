const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Permission aggregation type for asset access - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AGGREGATED_PERMISSION',
                    'DIRECT_PERMISSION',
                ],
            }
        )
    }

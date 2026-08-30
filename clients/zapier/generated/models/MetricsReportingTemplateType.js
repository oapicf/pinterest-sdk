const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Reporting template type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNSPECIFIED',
                    'BULK',
                    'OVERVIEW',
                    'TABLE',
                    'MMM',
                    'BRAND_CATEGORY',
                ],
            }
        )
    }

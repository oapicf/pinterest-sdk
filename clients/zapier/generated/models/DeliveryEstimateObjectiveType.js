const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Objective type for delivery estimates. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AWARENESS',
                    'CONSIDERATION',
                    'CATALOG_SALES',
                    'WEB_CONVERSION',
                ],
            }
        )
    }

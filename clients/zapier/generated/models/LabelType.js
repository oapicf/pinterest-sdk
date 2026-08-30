const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Label type values. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BRAND',
                    'CUSTOM',
                ],
            }
        )
    }

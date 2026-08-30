const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'TRENDS',
                    'CLONE_META',
                    'BULK_EDITOR',
                    'AD_ROTATION',
                ],
            }
        )
    }

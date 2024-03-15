const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Entity status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACTIVE',
                    'PAUSED',
                    'ARCHIVED',
                    'DRAFT',
                    'DELETED_DRAFT',
                ],
            }
        )
    }

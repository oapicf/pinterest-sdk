const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Label status values. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACTIVE',
                    'ARCHIVED',
                ],
            }
        )
    }

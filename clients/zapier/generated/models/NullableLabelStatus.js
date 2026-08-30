const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`). - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACTIVE',
                    'ARCHIVED',
                    '',
                ],
            }
        )
    }

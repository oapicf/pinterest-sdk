const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Status of the lead form - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DRAFT',
                    'ACTIVE',
                ],
            }
        )
    }

const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Campaign placement group type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ALL',
                    'SEARCH',
                    'BROWSE',
                    'OTHER',
                ],
            }
        )
    }

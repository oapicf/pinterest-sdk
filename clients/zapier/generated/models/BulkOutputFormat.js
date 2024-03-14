const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Bulk file output format - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CSV',
                    'JSON',
                ],
            }
        )
    }

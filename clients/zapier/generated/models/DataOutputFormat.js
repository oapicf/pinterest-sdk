const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Format of generated report - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'JSON',
                    'CSV',
                ],
            }
        )
    }

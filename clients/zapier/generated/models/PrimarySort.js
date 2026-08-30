const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Whether to first sort the report by date or by ID - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BY_ID',
                    'BY_DATE',
                ],
            }
        )
    }

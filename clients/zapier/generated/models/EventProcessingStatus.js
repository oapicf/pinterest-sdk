const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Status of a single event in the response. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'failed',
                    'processed',
                ],
            }
        )
    }

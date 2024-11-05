const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Status of a leads export job - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IN_PROGRESS',
                    'FINISHED',
                    'FAILED',
                ],
            }
        )
    }

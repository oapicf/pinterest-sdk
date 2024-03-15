const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Possible status for a bulk reporting job - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DOES_NOT_EXIST',
                    'FINISHED',
                    'IN_PROGRESS',
                    'EXPIRED',
                    'FAILED',
                    'CANCELLED',
                ],
            }
        )
    }

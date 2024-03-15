const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The enhanced match status of the tag - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN',
                    'NOT_VALIDATED',
                    'VALIDATING_IN_PROGRESS',
                    'VALIDATION_COMPLETE',
                    '',
                ],
            }
        )
    }

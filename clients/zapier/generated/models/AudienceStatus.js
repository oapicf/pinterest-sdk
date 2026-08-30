const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Audience processing status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'INITIALIZING',
                    'READY',
                    'TOO_SMALL',
                    'ELIGIBLE',
                    'PERSONAS_INELIGIBLE_SIZE',
                    'PERSONAS_INITIALIZING',
                ],
            }
        )
    }

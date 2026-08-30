const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Billing profile status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNSPECIFIED',
                    'VALID',
                    'INVALID',
                    'PENDING',
                    'DELETED',
                    'SECONDARY',
                    'PENDING_SECONDARY',
                ],
            }
        )
    }

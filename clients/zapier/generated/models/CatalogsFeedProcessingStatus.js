const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'COMPLETED',
                    'COMPLETED_EARLY',
                    'DISAPPROVED',
                    'FAILED',
                    'PROCESSING',
                    'QUEUED_FOR_PROCESSING',
                    'UNDER_APPEAL',
                    'UNDER_REVIEW',
                ],
            }
        )
    }

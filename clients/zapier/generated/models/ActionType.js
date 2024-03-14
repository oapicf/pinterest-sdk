const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad group billable event type. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CLICKTHROUGH',
                    'IMPRESSION',
                    'VIDEO_V_50_MRC',
                    'BILLABLE_ENGAGEMENT',
                ],
            }
        )
    }

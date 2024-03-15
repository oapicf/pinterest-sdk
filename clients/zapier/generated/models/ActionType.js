const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad group billable event type. For update, only draft ad groups may update billable event. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CLICKTHROUGH',
                    'IMPRESSION',
                    'VIDEO_V_50_MRC',
                ],
            }
        )
    }

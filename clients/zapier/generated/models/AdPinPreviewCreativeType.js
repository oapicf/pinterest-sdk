const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'SHOPPING',
                    'COLLECTION',
                    'MAX_VIDEO',
                    'MAX_WIDTH_VIDEO_COLLECTION',
                    'MAX_WIDTH_REGULAR_COLLECTION',
                ],
            }
        )
    }

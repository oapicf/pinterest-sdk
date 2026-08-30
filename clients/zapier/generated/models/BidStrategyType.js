const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\". - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AUTOMATIC_BID',
                    'MAX_BID',
                    'TARGET_AVG',
                    '',
                ],
            }
        )
    }

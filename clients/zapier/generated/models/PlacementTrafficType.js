const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ALL',
                    'TWO_COLUMN_FEED',
                    'FULLSCREEN_FEED',
                    '',
                ],
            }
        )
    }

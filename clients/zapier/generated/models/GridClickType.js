const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CLOSEUP',
                    'DIRECT_TO_DESTINATION',
                ],
            }
        )
    }

const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BRAND',
                    'CUSTOM',
                    '',
                ],
            }
        )
    }

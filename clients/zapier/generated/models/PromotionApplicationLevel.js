const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Specify if the promotion is applied at ad group or item level. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NONE',
                    'ITEM',
                    'AD_GROUP',
                    '',
                ],
            }
        )
    }

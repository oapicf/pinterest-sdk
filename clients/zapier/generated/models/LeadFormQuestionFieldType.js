const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Lead form question field type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'TEXT_FIELD',
                    'TEXT_AREA',
                    'RADIO_LIST',
                    'CHECKBOX',
                    '',
                ],
            }
        )
    }

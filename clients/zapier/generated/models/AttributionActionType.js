const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of an attributed action. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'view',
                    'click',
                ],
            }
        )
    }

const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Fields that can be updated in campaign bid options. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AUDIENCE',
                    'APP_TYPE',
                    'PLACEMENT',
                    'GENDER',
                    'AGE_BUCKET',
                    'FREQUENCY',
                ],
            }
        )
    }

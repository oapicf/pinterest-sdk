const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Severity of a confidence level alert on delivery estimates. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN',
                    'LOW_MILD',
                    'LOW_MODERATE',
                    'LOW_SEVERE',
                ],
            }
        )
    }

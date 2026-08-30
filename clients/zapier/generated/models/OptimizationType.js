const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Optimization type for ad group delivery estimates. Supported types vary by objective. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CLICKTHROUGH',
                    'IMPRESSION',
                    'WEB_CONVERSION',
                    'ROAS',
                    'OUTBOUND_CLICK',
                ],
            }
        )
    }

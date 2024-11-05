const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. For update, only draft campaigns may update objective type. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AWARENESS',
                    'CONSIDERATION',
                    'VIDEO_VIEW',
                    'WEB_CONVERSION',
                    'CATALOG_SALES',
                    'WEB_SESSIONS',
                    'VIDEO_COMPLETION',
                ],
            }
        )
    }

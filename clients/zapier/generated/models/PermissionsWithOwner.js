const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'ADMIN',
                    'ANALYST',
                    'FINANCE_MANAGER',
                    'AUDIENCE_MANAGER',
                    'CAMPAIGN_MANAGER',
                    'CATALOGS_MANAGER',
                    'CATALOGS_VIEWER',
                    'PROFILE_PUBLISHER',
                    'OWNER',
                ],
            }
        )
    }

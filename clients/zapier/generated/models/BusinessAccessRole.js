const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Permission role for business access. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OWNER',
                    'ADMIN',
                    'ANALYST',
                    'SOS_READER',
                    'FINANCE_MANAGER',
                    'AUDIENCE_MANAGER',
                    'CAMPAIGN_MANAGER',
                    'CATALOGS_MANAGER',
                    'RESTRICTED_OWNER',
                    'PROFILE_MANAGER',
                    'PROFILE_PUBLISHER',
                    'RESOURCE_PINNER_LIST_OWNER',
                    'RESOURCE_PINNER_LIST_READER',
                    'BIZ_PINNER_LIST_SHARER',
                    'RESOURCE_CONVERSION_TAGS_READER',
                ],
            }
        )
    }

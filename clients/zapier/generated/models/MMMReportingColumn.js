const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Marketing Mix Modeling (MMM) Reporting Columns - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SPEND_IN_DOLLAR',
                    'SPEND_IN_MICRO_DOLLAR',
                    'ECPC_IN_DOLLAR',
                    'ECTR',
                    'CAMPAIGN_NAME',
                    'TOTAL_ENGAGEMENT',
                    'EENGAGEMENT_RATE',
                    'ECPM_IN_DOLLAR',
                    'CAMPAIGN_ID',
                    'ADVERTISER_ID',
                    'AD_GROUP_ID',
                    'AD_GROUP_NAME',
                    'CLICKTHROUGH_1',
                    'IMPRESSION_1',
                    'CLICKTHROUGH_2',
                    'IMPRESSION_2',
                    'TOTAL_CLICKTHROUGH',
                    'TOTAL_IMPRESSION',
                    'ADVERTISER_NAME',
                    'SPEND_ORDER_LINE_PAID_TYPE',
                ],
            }
        )
    }

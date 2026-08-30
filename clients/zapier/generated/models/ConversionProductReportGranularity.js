const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'TOTAL',
                    'WEEK',
                    'MONTH',
                ],
            }
        )
    }

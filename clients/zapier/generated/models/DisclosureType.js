const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NO_DISCLOSURE',
                    'PRESCRIBING_INFORMATION',
                    'PRESCRIBING_INFORMATION_BOX_WARNING',
                    'IMPORTANT_SAFETY_INFO',
                    'MED_GUIDE',
                    'PATIENT_INFORMATION',
                    '',
                ],
            }
        )
    }

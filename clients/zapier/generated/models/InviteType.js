const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'MEMBER_INVITE',
                    'PARTNER_INVITE',
                    'PARTNER_REQUEST',
                ],
            }
        )
    }

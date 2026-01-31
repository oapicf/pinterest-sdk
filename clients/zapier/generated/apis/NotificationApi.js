const samples = require('../samples/NotificationApi');
const Error = require('../models/Error');
const NotificationResponse = require('../models/NotificationResponse');
const notification_post_request = require('../models/notification_post_request');
const utils = require('../utils/utils');

module.exports = {
    notification/post: {
        key: 'notification/post',
        noun: 'notification',
        display: {
            label: 'Receive notifications from external partners.',
            description: 'Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...notification_post_request.fields(),
            ],
            outputFields: [
                ...NotificationResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/notifications'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...notification_post_request.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'notification/post', response.json);
                    return results;
                })
            },
            sample: samples['NotificationResponseSample']
        }
    },
}

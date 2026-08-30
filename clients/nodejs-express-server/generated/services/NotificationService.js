/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Receive notifications from external partners.
* Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
*
* notificationPostRequest NotificationPostRequest 
* returns NotificationResponse
* */
const notification/post = ({ notificationPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        notificationPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  notification/post,
};

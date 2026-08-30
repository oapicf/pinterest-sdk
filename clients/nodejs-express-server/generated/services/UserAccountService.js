/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List following boards
* Get a list of the boards a user follows. The request returns a board summary object array.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* explicitUnderscorefollowing Boolean Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns boards_list_200_response
* */
const boards_user_follows/list = ({ adUnderscoreaccountUnderscoreid, explicitUnderscorefollowing, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        explicitUnderscorefollowing,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Follow user
* **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
*
* username String A valid username
* followUserCreate FollowUserCreate 
* returns FollowUser
* */
const follow_user/update = ({ username, followUserCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        followUserCreate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List followers
* Get a list of your followers.
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns followers_list_200_response
* */
const followers/list = ({ bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List linked businesses
* Get a list of your linked business accounts.
*
* returns List
* */
const linked_business_accounts/get = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unverify website
* Unverify a website verified by the signed-in user.
*
* website String Website with path or domain only
* returns UserWebsite
* */
const unverify_website/delete = ({ website }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        website,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user account analytics
* Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* fromUnderscoreclaimedUnderscorecontent String Filter on Pins that match your claimed domain. (optional)
* pinUnderscoreformat String Pin formats to get data for, default is all. (optional)
* appUnderscoretypes String Apps or devices to get data for, default is all. (optional)
* contentUnderscoretype String Filter to paid or organic data. Default is all. (optional)
* source String Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
* metricUnderscoretypes List Metric types to get data for, default is all. (optional)
* splitUnderscorefield String How to split the data into groups. Not including this param means data won't be split. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Map
* */
const user_account/analytics = ({ startUnderscoredate, endUnderscoredate, fromUnderscoreclaimedUnderscorecontent, pinUnderscoreformat, appUnderscoretypes, contentUnderscoretype, source, metricUnderscoretypes, splitUnderscorefield, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        fromUnderscoreclaimedUnderscorecontent,
        pinUnderscoreformat,
        appUnderscoretypes,
        contentUnderscoretype,
        source,
        metricUnderscoretypes,
        splitUnderscorefield,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user account top pins analytics
* Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* sortUnderscoreby TopPinsSortBy Specify sorting order for metrics
* fromUnderscoreclaimedUnderscorecontent String Filter on Pins that match your claimed domain. (optional)
* pinUnderscoreformat String Pin formats to get data for, default is all. (optional)
* appUnderscoretypes String Apps or devices to get data for, default is all. (optional)
* contentUnderscoretype String Filter to paid or organic data. Default is all. (optional)
* source String Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
* metricUnderscoretypes List Metric types to get data for, default is all. (optional)
* numUnderscoreofUnderscorepins Integer Number of pins to include, default is 10. Max is 50. (optional)
* createdUnderscoreinUnderscorelastUnderscorenUnderscoredays BigDecimal Get metrics for pins created in the last \"n\" days. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns TopPinsAnalyticsResponse
* */
const user_account/analytics/top_pins = ({ startUnderscoredate, endUnderscoredate, sortUnderscoreby, fromUnderscoreclaimedUnderscorecontent, pinUnderscoreformat, appUnderscoretypes, contentUnderscoretype, source, metricUnderscoretypes, numUnderscoreofUnderscorepins, createdUnderscoreinUnderscorelastUnderscorenUnderscoredays, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        sortUnderscoreby,
        fromUnderscoreclaimedUnderscorecontent,
        pinUnderscoreformat,
        appUnderscoretypes,
        contentUnderscoretype,
        source,
        metricUnderscoretypes,
        numUnderscoreofUnderscorepins,
        createdUnderscoreinUnderscorelastUnderscorenUnderscoredays,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user account top video pins analytics
* Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
*
* startUnderscoredate date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
* endUnderscoredate date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
* sortUnderscoreby TopVideoPinsSortBy Specify sorting order for video metrics
* fromUnderscoreclaimedUnderscorecontent String Filter on Pins that match your claimed domain. (optional)
* pinUnderscoreformat String Pin formats to get data for, default is all. (optional)
* appUnderscoretypes String Apps or devices to get data for, default is all. (optional)
* contentUnderscoretype String Filter to paid or organic data. Default is all. (optional)
* source String Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
* metricUnderscoretypes List Metric types to get video data for, default is all. (optional)
* numUnderscoreofUnderscorepins Integer Number of pins to include, default is 10. Max is 50. (optional)
* createdUnderscoreinUnderscorelastUnderscorenUnderscoredays BigDecimal Get metrics for pins created in the last \"n\" days. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns TopVideoPinsAnalyticsResponse
* */
const user_account/analytics/top_video_pins = ({ startUnderscoredate, endUnderscoredate, sortUnderscoreby, fromUnderscoreclaimedUnderscorecontent, pinUnderscoreformat, appUnderscoretypes, contentUnderscoretype, source, metricUnderscoretypes, numUnderscoreofUnderscorepins, createdUnderscoreinUnderscorelastUnderscorenUnderscoredays, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoredate,
        endUnderscoredate,
        sortUnderscoreby,
        fromUnderscoreclaimedUnderscorecontent,
        pinUnderscoreformat,
        appUnderscoretypes,
        contentUnderscoretype,
        source,
        metricUnderscoretypes,
        numUnderscoreofUnderscorepins,
        createdUnderscoreinUnderscorelastUnderscorenUnderscoredays,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List following interests
* Get a list of a user's following interests in one place.
*
* username String A valid username
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns user_account_followed_interests_200_response
* */
const user_account/followed_interests = ({ username, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        username,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user account
* Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns Account
* */
const user_account/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List following
* Get a list of who a certain user follows.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* explicitUnderscorefollowing Boolean Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
* feedUnderscoretype UserFollowingFeedType Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns followers_list_200_response
* */
const user_following/get = ({ adUnderscoreaccountUnderscoreid, explicitUnderscorefollowing, feedUnderscoretype, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        explicitUnderscorefollowing,
        feedUnderscoretype,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user websites
* Get user websites, claimed or not
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns user_websites_get_200_response
* */
const user_websites/get = ({ bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Verify website
* Verify a website as a signed-in user.
*
* userWebsiteCreate UserWebsiteCreate 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns UserWebsite
* */
const verify_website/update = ({ userWebsiteCreate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userWebsiteCreate,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user verification code for website claiming
* Get verification code for user to install on the website to claim it.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns UserWebsiteVerification
* */
const website_verification/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
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
  boards_user_follows/list,
  follow_user/update,
  followers/list,
  linked_business_accounts/get,
  unverify_website/delete,
  user_account/analytics,
  user_account/analytics/top_pins,
  user_account/analytics/top_video_pins,
  user_account/followed_interests,
  user_account/get,
  user_following/get,
  user_websites/get,
  verify_website/update,
  website_verification/get,
};

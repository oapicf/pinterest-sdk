const samples = require('../samples/UserAccountApi');
const Account = require('../models/Account');
const AnalyticsMetricsResponse = require('../models/AnalyticsMetricsResponse');
const Error = require('../models/Error');
const FollowUserRequest = require('../models/FollowUserRequest');
const LinkedBusiness = require('../models/LinkedBusiness');
const TopPinsAnalyticsResponse = require('../models/TopPinsAnalyticsResponse');
const TopVideoPinsAnalyticsResponse = require('../models/TopVideoPinsAnalyticsResponse');
const UserFollowingFeedType = require('../models/UserFollowingFeedType');
const UserSummary = require('../models/UserSummary');
const UserWebsiteSummary = require('../models/UserWebsiteSummary');
const UserWebsiteVerificationCode = require('../models/UserWebsiteVerificationCode');
const UserWebsiteVerifyRequest = require('../models/UserWebsiteVerifyRequest');
const boards_user_follows_list_200_response = require('../models/boards_user_follows_list_200_response');
const followers_list_200_response = require('../models/followers_list_200_response');
const user_account_followed_interests_200_response = require('../models/user_account_followed_interests_200_response');
const user_following_get_200_response = require('../models/user_following_get_200_response');
const user_websites_get_200_response = require('../models/user_websites_get_200_response');
const utils = require('../utils/utils');

module.exports = {
    boardsUserFollows/list: {
        key: 'boardsUserFollows/list',
        noun: 'user_account',
        display: {
            label: 'List following boards',
            description: 'Get a list of the boards a user follows. The request returns a board summary object array.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'explicit_following',
                    label: 'Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.',
                    type: 'boolean',
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...boards_user_follows_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/following/boards'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'explicit_following': bundle.inputData?.['explicit_following'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'boardsUserFollows/list', response.json);
                    return results;
                })
            },
            sample: samples['boards_user_follows_list_200_responseSample']
        }
    },
    followUser/update: {
        key: 'followUser/update',
        noun: 'user_account',
        display: {
            label: 'Follow user',
            description: '&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'username',
                    label: 'A valid username',
                    type: 'string',
                    required: true,
                },
                ...FollowUserRequest.fields(),
            ],
            outputFields: [
                ...UserSummary.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/following/{username}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...FollowUserRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'followUser/update', response.json);
                    return results;
                })
            },
            sample: samples['UserSummarySample']
        }
    },
    followers/list: {
        key: 'followers/list',
        noun: 'user_account',
        display: {
            label: 'List followers',
            description: 'Get a list of your followers.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...followers_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/followers'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'followers/list', response.json);
                    return results;
                })
            },
            sample: samples['followers_list_200_responseSample']
        }
    },
    linkedBusinessAccounts/get: {
        key: 'linkedBusinessAccounts/get',
        noun: 'user_account',
        display: {
            label: 'List linked businesses',
            description: 'Get a list of your linked business accounts.',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/businesses'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'linkedBusinessAccounts/get', response.json);
                    return results;
                })
            },
            sample: samples['LinkedBusinessSample']
        }
    },
    unverifyWebsite/delete: {
        key: 'unverifyWebsite/delete',
        noun: 'user_account',
        display: {
            label: 'Unverify website',
            description: 'Unverifu a website verified by the signed-in user.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'website',
                    label: 'Website with path or domain only',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/websites'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'website': bundle.inputData?.['website'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'unverifyWebsite/delete', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    userAccount/analytics: {
        key: 'userAccount/analytics',
        noun: 'user_account',
        display: {
            label: 'Get user account analytics',
            description: 'Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'from_claimed_content',
                    label: 'Filter on Pins that match your claimed domain.',
                    type: 'string',
                    choices: [
                        'OTHER',
                        'CLAIMED',
                        'BOTH',
                    ],
                },
                {
                    key: 'pin_format',
                    label: 'Pin formats to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'ORGANIC_IMAGE',
                        'ORGANIC_PRODUCT',
                        'ORGANIC_VIDEO',
                        'ADS_STANDARD',
                        'ADS_PRODUCT',
                        'ADS_VIDEO',
                        'ADS_IDEA',
                    ],
                },
                {
                    key: 'app_types',
                    label: 'Apps or devices to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'MOBILE',
                        'TABLET',
                        'WEB',
                    ],
                },
                {
                    key: 'content_type',
                    label: 'Filter to paid or organic data. Default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'PAID',
                        'ORGANIC',
                    ],
                },
                {
                    key: 'source',
                    label: 'Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts',
                    type: 'string',
                    choices: [
                        'ALL',
                        'YOUR_PINS',
                        'OTHER_PINS',
                    ],
                },
                {
                    key: 'metric_types',
                    label: 'Metric types to get data for, default is all. ',
                    type: 'string',
                }
                {
                    key: 'split_field',
                    label: 'How to split the data into groups. Not including this param means data won&#39;t be split.',
                    type: 'string',
                    choices: [
                        'NO_SPLIT',
                        'APP_TYPE',
                        'OWNED_CONTENT',
                        'SOURCE',
                        'PIN_FORMAT',
                    ],
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...object.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/analytics'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'from_claimed_content': bundle.inputData?.['from_claimed_content'],
                        'pin_format': bundle.inputData?.['pin_format'],
                        'app_types': bundle.inputData?.['app_types'],
                        'content_type': bundle.inputData?.['content_type'],
                        'source': bundle.inputData?.['source'],
                        'metric_types': bundle.inputData?.['metric_types'],
                        'split_field': bundle.inputData?.['split_field'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'userAccount/analytics', response.json);
                    return results;
                })
            },
            sample: samples['AnalyticsMetricsResponseSample']
        }
    },
    userAccount/analytics/topPins: {
        key: 'userAccount/analytics/topPins',
        noun: 'user_account',
        display: {
            label: 'Get user account top pins analytics',
            description: 'Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'sort_by',
                    label: 'Specify sorting order for metrics',
                    type: 'string',
                    required: true,
                    choices: [
                        'ENGAGEMENT',
                        'IMPRESSION',
                        'OUTBOUND_CLICK',
                        'PIN_CLICK',
                        'SAVE',
                    ],
                },
                {
                    key: 'from_claimed_content',
                    label: 'Filter on Pins that match your claimed domain.',
                    type: 'string',
                    choices: [
                        'OTHER',
                        'CLAIMED',
                        'BOTH',
                    ],
                },
                {
                    key: 'pin_format',
                    label: 'Pin formats to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'ORGANIC_IMAGE',
                        'ORGANIC_PRODUCT',
                        'ORGANIC_VIDEO',
                        'ADS_STANDARD',
                        'ADS_PRODUCT',
                        'ADS_VIDEO',
                        'ADS_IDEA',
                    ],
                },
                {
                    key: 'app_types',
                    label: 'Apps or devices to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'MOBILE',
                        'TABLET',
                        'WEB',
                    ],
                },
                {
                    key: 'content_type',
                    label: 'Filter to paid or organic data. Default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'PAID',
                        'ORGANIC',
                    ],
                },
                {
                    key: 'source',
                    label: 'Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts',
                    type: 'string',
                    choices: [
                        'ALL',
                        'YOUR_PINS',
                        'OTHER_PINS',
                    ],
                },
                {
                    key: 'metric_types',
                    label: 'Metric types to get data for, default is all. ',
                    type: 'string',
                }
                {
                    key: 'num_of_pins',
                    label: 'Number of pins to include, default is 10. Max is 50.',
                    type: 'integer',
                },
                {
                    key: 'created_in_last_n_days',
                    label: 'Get metrics for pins created in the last \&quot;n\&quot; days.',
                    type: 'integer',
                    choices: [
                        '30',
                    ],
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...TopPinsAnalyticsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/analytics/top_pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'sort_by': bundle.inputData?.['sort_by'],
                        'from_claimed_content': bundle.inputData?.['from_claimed_content'],
                        'pin_format': bundle.inputData?.['pin_format'],
                        'app_types': bundle.inputData?.['app_types'],
                        'content_type': bundle.inputData?.['content_type'],
                        'source': bundle.inputData?.['source'],
                        'metric_types': bundle.inputData?.['metric_types'],
                        'num_of_pins': bundle.inputData?.['num_of_pins'],
                        'created_in_last_n_days': bundle.inputData?.['created_in_last_n_days'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'userAccount/analytics/topPins', response.json);
                    return results;
                })
            },
            sample: samples['TopPinsAnalyticsResponseSample']
        }
    },
    userAccount/analytics/topVideoPins: {
        key: 'userAccount/analytics/topVideoPins',
        noun: 'user_account',
        display: {
            label: 'Get user account top video pins analytics',
            description: 'Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_date',
                    label: 'Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'end_date',
                    label: 'Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'sort_by',
                    label: 'Specify sorting order for video metrics',
                    type: 'string',
                    required: true,
                    choices: [
                        'IMPRESSION',
                        'SAVE',
                        'OUTBOUND_CLICK',
                        'VIDEO_MRC_VIEW',
                        'VIDEO_AVG_WATCH_TIME',
                        'VIDEO_V50_WATCH_TIME',
                        'QUARTILE_95_PERCENT_VIEW',
                        'VIDEO_10S_VIEW',
                        'VIDEO_START',
                    ],
                },
                {
                    key: 'from_claimed_content',
                    label: 'Filter on Pins that match your claimed domain.',
                    type: 'string',
                    choices: [
                        'OTHER',
                        'CLAIMED',
                        'BOTH',
                    ],
                },
                {
                    key: 'pin_format',
                    label: 'Pin formats to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'ORGANIC_IMAGE',
                        'ORGANIC_PRODUCT',
                        'ORGANIC_VIDEO',
                        'ADS_STANDARD',
                        'ADS_PRODUCT',
                        'ADS_VIDEO',
                        'ADS_IDEA',
                    ],
                },
                {
                    key: 'app_types',
                    label: 'Apps or devices to get data for, default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'MOBILE',
                        'TABLET',
                        'WEB',
                    ],
                },
                {
                    key: 'content_type',
                    label: 'Filter to paid or organic data. Default is all.',
                    type: 'string',
                    choices: [
                        'ALL',
                        'PAID',
                        'ORGANIC',
                    ],
                },
                {
                    key: 'source',
                    label: 'Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts',
                    type: 'string',
                    choices: [
                        'ALL',
                        'YOUR_PINS',
                        'OTHER_PINS',
                    ],
                },
                {
                    key: 'metric_types',
                    label: 'Metric types to get video data for, default is all. ',
                    type: 'string',
                }
                {
                    key: 'num_of_pins',
                    label: 'Number of pins to include, default is 10. Max is 50.',
                    type: 'integer',
                },
                {
                    key: 'created_in_last_n_days',
                    label: 'Get metrics for pins created in the last \&quot;n\&quot; days.',
                    type: 'integer',
                    choices: [
                        '30',
                    ],
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...TopVideoPinsAnalyticsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/analytics/top_video_pins'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_date': bundle.inputData?.['start_date'],
                        'end_date': bundle.inputData?.['end_date'],
                        'sort_by': bundle.inputData?.['sort_by'],
                        'from_claimed_content': bundle.inputData?.['from_claimed_content'],
                        'pin_format': bundle.inputData?.['pin_format'],
                        'app_types': bundle.inputData?.['app_types'],
                        'content_type': bundle.inputData?.['content_type'],
                        'source': bundle.inputData?.['source'],
                        'metric_types': bundle.inputData?.['metric_types'],
                        'num_of_pins': bundle.inputData?.['num_of_pins'],
                        'created_in_last_n_days': bundle.inputData?.['created_in_last_n_days'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'userAccount/analytics/topVideoPins', response.json);
                    return results;
                })
            },
            sample: samples['TopVideoPinsAnalyticsResponseSample']
        }
    },
    userAccount/followedInterests: {
        key: 'userAccount/followedInterests',
        noun: 'user_account',
        display: {
            label: 'List following interests',
            description: 'Get a list of a user&#39;s following interests in one place.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'username',
                    label: 'A valid username',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...user_account_followed_interests_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/users/{username}/interests/follow'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'userAccount/followedInterests', response.json);
                    return results;
                })
            },
            sample: samples['user_account_followed_interests_200_responseSample']
        }
    },
    userAccount/get: {
        key: 'userAccount/get',
        noun: 'user_account',
        display: {
            label: 'Get user account',
            description: 'Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Account.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'userAccount/get', response.json);
                    return results;
                })
            },
            sample: samples['AccountSample']
        }
    },
    userFollowing/get: {
        key: 'userFollowing/get',
        noun: 'user_account',
        display: {
            label: 'List following',
            description: 'Get a list of who a certain user follows.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
                {
                    key: 'feed_type',
                    label: 'Thrift param specifying what type of followees will be kept. Default to include all followees.',
                    type: 'UserFollowingFeedType',
                },
                {
                    key: 'explicit_following',
                    label: 'Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.',
                    type: 'boolean',
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...user_following_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/following'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'feed_type': bundle.inputData?.['feed_type'],
                        'explicit_following': bundle.inputData?.['explicit_following'],
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'userFollowing/get', response.json);
                    return results;
                })
            },
            sample: samples['user_following_get_200_responseSample']
        }
    },
    userWebsites/get: {
        key: 'userWebsites/get',
        noun: 'user_account',
        display: {
            label: 'Get user websites',
            description: 'Get user websites, claimed or not',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...user_websites_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/websites'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'userWebsites/get', response.json);
                    return results;
                })
            },
            sample: samples['user_websites_get_200_responseSample']
        }
    },
    verifyWebsite/update: {
        key: 'verifyWebsite/update',
        noun: 'user_account',
        display: {
            label: 'Verify website',
            description: 'Verify a website as a signed-in user.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...UserWebsiteVerifyRequest.fields(),
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UserWebsiteSummary.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/websites'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                        ...UserWebsiteVerifyRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'verifyWebsite/update', response.json);
                    return results;
                })
            },
            sample: samples['UserWebsiteSummarySample']
        }
    },
    websiteVerification/get: {
        key: 'websiteVerification/get',
        noun: 'user_account',
        display: {
            label: 'Get user verification code for website claiming',
            description: 'Get verification code for user to install on the website to claim it.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UserWebsiteVerificationCode.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/user_account/websites/verification'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ad_account_id': bundle.inputData?.['ad_account_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'websiteVerification/get', response.json);
                    return results;
                })
            },
            sample: samples['UserWebsiteVerificationCodeSample']
        }
    },
}

const samples = require('../samples/TrendsApi');
const AgeTrendsBucket = require('../models/AgeTrendsBucket');
const FeaturedTrend = require('../models/FeaturedTrend');
const GenderBucket = require('../models/GenderBucket');
const InterestsEnum = require('../models/InterestsEnum');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const ProductCategoriesEngagementType = require('../models/ProductCategoriesEngagementType');
const ProductCategoryDetailLookbackWindow = require('../models/ProductCategoryDetailLookbackWindow');
const ProductCategoryDetails = require('../models/ProductCategoryDetails');
const ProductCategoryEnum = require('../models/ProductCategoryEnum');
const ProductCategoryRegion = require('../models/ProductCategoryRegion');
const TrendingProductCategory = require('../models/TrendingProductCategory');
const TrendsEditorial = require('../models/TrendsEditorial');
const VerticalProductCategory = require('../models/VerticalProductCategory');
const utils = require('../utils/utils');

module.exports = {
    trendsEditorialArticles/list: {
        key: 'trendsEditorialArticles/list',
        noun: 'trends',
        display: {
            label: 'Returns editorial articles for a given region',
            description: '  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/trends/editorial_articles'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'region': bundle.inputData?.['region'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'trendsEditorialArticles/list', response.json);
                    return results;
                })
            },
            sample: samples['TrendsEditorialSample']
        }
    },
    trendsFeaturedTopics/list: {
        key: 'trendsFeaturedTopics/list',
        noun: 'trends',
        display: {
            label: 'Get featured topics',
            description: '  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/trends/topics/featured'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'region': bundle.inputData?.['region'],
                        'interest': bundle.inputData?.['interest'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'trendsFeaturedTopics/list', response.json);
                    return results;
                })
            },
            sample: samples['FeaturedTrendSample']
        }
    },
    trendsProductCategoriesDetails/list: {
        key: 'trendsProductCategoriesDetails/list',
        noun: 'trends',
        display: {
            label: 'Get product category details',
            description: '  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product_categories',
                    label: 'List of product categories',
                    type: 'string',
                }
                ....fields(),
                ....fields(),
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/trends/product_categories/details'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'product_categories': bundle.inputData?.['product_categories'],
                        'region': bundle.inputData?.['region'],
                        'lookback_window': bundle.inputData?.['lookback_window'],
                        'engagement_type': bundle.inputData?.['engagement_type'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'trendsProductCategoriesDetails/list', response.json);
                    return results;
                })
            },
            sample: samples['ProductCategoryDetailsSample']
        }
    },
    trendsProductCategoriesTrending/list: {
        key: 'trendsProductCategoriesTrending/list',
        noun: 'trends',
        display: {
            label: 'Get a list of growing Shopping Product Categories',
            description: '  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
                {
                    key: 'verticals',
                    label: 'List of verticals to filter by',
                    type: 'string',
                }
                {
                    key: 'ages',
                    label: 'Age to filter by. If not provided, the results will be filtered by all ages.',
                    type: 'string',
                }
                {
                    key: 'genders',
                    label: 'Gender to filter by, If not provided, the results will be filtered by all genders.',
                    type: 'string',
                }
                ....fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/trends/product_categories/trending'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'region': bundle.inputData?.['region'],
                        'verticals': bundle.inputData?.['verticals'],
                        'ages': bundle.inputData?.['ages'],
                        'genders': bundle.inputData?.['genders'],
                        'engagement_type': bundle.inputData?.['engagement_type'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'trendsProductCategoriesTrending/list', response.json);
                    return results;
                })
            },
            sample: samples['TrendingProductCategorySample']
        }
    },
}

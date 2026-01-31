/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get featured topics
*   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
*
* region ProductCategoryRegion       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
* interest InterestsEnum Interest to filter by (optional)
* returns List
* */
const trends_featured_topics/list = ({ region, interest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        region,
        interest,
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
* Get product category details
*   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
*
* productUnderscorecategories List List of product categories
* region ProductCategoryRegion       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
* lookbackUnderscorewindow ProductCategoryDetailLookbackWindow    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
* engagementUnderscoretype ProductCategoriesEngagementType      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)
* returns List
* */
const trends_product_categories_details/list = ({ productUnderscorecategories, region, lookbackUnderscorewindow, engagementUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        productUnderscorecategories,
        region,
        lookbackUnderscorewindow,
        engagementUnderscoretype,
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
* Get a list of growing Shopping Product Categories
*   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
*
* region ProductCategoryRegion       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
* verticals List List of verticals to filter by (optional)
* ages List Age to filter by. If not provided, the results will be filtered by all ages. (optional)
* genders List Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
* engagementUnderscoretype ProductCategoriesEngagementType      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)
* returns List
* */
const trends_product_categories_trending/list = ({ region, verticals, ages, genders, engagementUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        region,
        verticals,
        ages,
        genders,
        engagementUnderscoretype,
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
  trends_featured_topics/list,
  trends_product_categories_details/list,
  trends_product_categories_trending/list,
};

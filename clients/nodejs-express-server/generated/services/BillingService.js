/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Redeem ad credits
* Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* adsCreditRedeemCreate AdsCreditRedeemCreate 
* returns AdsCreditRedeem
* */
const ads_credit/redeem = ({ adUnderscoreaccountUnderscoreid, adsCreditRedeemCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        adsCreditRedeemCreate,
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
* Get ads credit discounts
* Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns ads_credits_discounts_get_200_response
* */
const ads_credits_discounts/get = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
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
* Get download url for a billing invoice
* Get download url for a billing invoice.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* billingUnderscoreinvoiceUnderscoreid String Unique identifier of a billing invoice.
* returns BillingInvoiceDownloadResponse
* */
const billing_invoice_download/get = ({ adUnderscoreaccountUnderscoreid, billingUnderscoreinvoiceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        billingUnderscoreinvoiceUnderscoreid,
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
* Get billing invoices
* Get billing invoices in the advertiser account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* sort BillingInvoiceSortField Field of which to sort billing invoices (optional)
* status BillingInvoiceStatus Status of billing invoices to filter by (optional)
* documentUnderscoretype BillingInvoiceDocumentType Document type of billing invoices to filter by (optional)
* startUnderscoredueUnderscoredate date Starting point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)
* endUnderscoredueUnderscoredate date Ending point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)
* returns billing_invoices_get_200_response
* */
const billing_invoices/get = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize, order, sort, status, documentUnderscoretype, startUnderscoredueUnderscoredate, endUnderscoredueUnderscoredate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
        order,
        sort,
        status,
        documentUnderscoretype,
        startUnderscoredueUnderscoredate,
        endUnderscoredueUnderscoredate,
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
* Get billing profiles
* Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
*
* isUnderscoreactive Boolean Return active billing profiles, if false return all billing profiles.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns billing_profiles_get_200_response
* */
const billing_profiles/get = ({ isUnderscoreactive, adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        isUnderscoreactive,
        adUnderscoreaccountUnderscoreid,
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
* Get Salesforce account details including bill-to information.
*   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns SSIOAccount
* */
const ssio_accounts/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
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
* Create insertion order through SSIO.
*   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* sSIOInsertionOrderCreate SSIOInsertionOrderCreate 
* returns SSIOInsertionOrder
* */
const ssio_insertion_order/create = ({ adUnderscoreaccountUnderscoreid, sSIOInsertionOrderCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        sSIOInsertionOrderCreate,
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
* Edit insertion order through SSIO.
*   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* sSIOInsertionOrderUpdate SSIOInsertionOrderUpdate 
* returns SSIOInsertionOrder
* */
const ssio_insertion_order/edit = ({ adUnderscoreaccountUnderscoreid, sSIOInsertionOrderUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        sSIOInsertionOrderUpdate,
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
* Get insertion order status by ad account id.
*   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns ssio_insertion_orders_status_get_by_ad_account_200_response
* */
const ssio_insertion_orders_status/get_by_ad_account = ({ adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
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
* Get insertion order status by pin order id.
*   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pinUnderscoreorderUnderscoreid String The pin order id associated with the ssio insertion order
* returns SSIOInsertionOrderStatusResponse
* */
const ssio_insertion_orders_status/get_by_pin_order_id = ({ adUnderscoreaccountUnderscoreid, pinUnderscoreorderUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        pinUnderscoreorderUnderscoreid,
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
* Get Salesforce order lines by ad account id.
*   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* pinUnderscoreorderUnderscoreid String The pin order id associated with the SSIO insertion order (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns ssio_order_lines_get_by_ad_account_200_response
* */
const ssio_order_lines/get_by_ad_account = ({ adUnderscoreaccountUnderscoreid, pinUnderscoreorderUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        pinUnderscoreorderUnderscoreid,
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

module.exports = {
  ads_credit/redeem,
  ads_credits_discounts/get,
  billing_invoice_download/get,
  billing_invoices/get,
  billing_profiles/get,
  ssio_accounts/get,
  ssio_insertion_order/create,
  ssio_insertion_order/edit,
  ssio_insertion_orders_status/get_by_ad_account,
  ssio_insertion_orders_status/get_by_pin_order_id,
  ssio_order_lines/get_by_ad_account,
};

#ifndef TINY_CPP_CLIENT_CatalogReportsApi_H_
#define TINY_CPP_CLIENT_CatalogReportsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CatalogsCreateReportResponse.h"
#include "CatalogsReport.h"
#include "CatalogsReportParameters.h"
#include "Error.h"
#include "Reports_stats_200_response.h"
#include "Reports_stats_parameters_parameter.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogReportsApi : public Service {
public:
    CatalogReportsApi() = default;

    virtual ~CatalogReportsApi() = default;

    /**
    * Build catalogs report.
    *
    * Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param catalogsReportParameters Request object to asynchronously create a report. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsCreateReportResponse
        >
    reports_create(
            
            CatalogsReportParameters catalogsReportParameters
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get catalogs report.
    *
    * This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
    * \param token Token returned from async build report call *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsReport
        >
    reports_get(
            
            std::string token
            , 
            
            std::string adAccountId
            
    );
    /**
    * List report stats.
    *
    * List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
    * \param parameters Contains the parameters for report identification. *Required*
    * \param adAccountId Unique identifier of an ad account.
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Reports_stats_200_response
        >
    reports_stats(
            
            Reports_stats_parameters_parameter parameters
            , 
            
            std::string adAccountId
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CatalogReportsApi_H_ */
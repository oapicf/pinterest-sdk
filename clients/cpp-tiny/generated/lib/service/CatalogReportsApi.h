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
#include "CatalogsReportStatsParameters.h"
#include "Pinterest.Lib.Error.h"
#include "Reports_stats_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogReportsApi : public Service {
public:
    CatalogReportsApi() = default;

    virtual ~CatalogReportsApi();

    /**
    * Build catalogs report.
    *
    * Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
    * \param catalogsReportParameters  *Required*
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
    * This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
    * \param token Token returned from the post request creation call *Required*
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
    * List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
    * \param parameters Contains the parameters for report identification. *Required*
    * \param adAccountId Unique identifier of an ad account.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Reports_stats_200_response
        >
    reports_stats(
            
            CatalogsReportStatsParameters parameters
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CatalogReportsApi_H_ */
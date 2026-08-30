#ifndef TINY_CPP_CLIENT_LeadsExportApi_H_
#define TINY_CPP_CLIENT_LeadsExportApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "LeadsExportResponseData.h"
#include "LeadsExports.h"
#include "LeadsExportsCreate.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class LeadsExportApi : public Service {
public:
    LeadsExportApi() = default;

    virtual ~LeadsExportApi();

    /**
    * Create a request to export leads collected from a lead ad.
    *
    * **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadsExportsCreate  *Required*
    */
    Response<
                LeadsExports
        >
    leadsExport_create(
            
            std::string adAccountId
            , 
            
            LeadsExportsCreate leadsExportsCreate
            
    );
    /**
    * Get the lead export from the lead export create call.
    *
    * **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadsExportId lead_export_id token returned from the create a lead export endpoint *Required*
    */
    Response<
                LeadsExportResponseData
        >
    leadsExport_get(
            
            std::string adAccountId
            , 
            
            std::string leadsExportId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_LeadsExportApi_H_ */
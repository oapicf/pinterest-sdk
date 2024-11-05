#ifndef _LeadsExportManager_H_
#define _LeadsExportManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "LeadsExportCreateRequest.h"
#include "LeadsExportCreateResponse.h"
#include "LeadsExportResponseData.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup LeadsExport LeadsExport
 * \ingroup Operations
 *  @{
 */
class LeadsExportManager {
public:
	LeadsExportManager();
	virtual ~LeadsExportManager();

/*! \brief Create a request to export leads collected from a lead ad. *Synchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadsExportCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadsExportCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LeadsExportCreateRequest> leadsExportCreateRequest, 
	void(* handler)(LeadsExportCreateResponse, Error, void* )
	, void* userData);

/*! \brief Create a request to export leads collected from a lead ad. *Asynchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadsExportCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadsExportCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LeadsExportCreateRequest> leadsExportCreateRequest, 
	void(* handler)(LeadsExportCreateResponse, Error, void* )
	, void* userData);


/*! \brief Get the lead export from the lead export create call. *Synchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadsExportId lead_export_id token returned from the create a lead export endpoint *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadsExportGetSync(char * accessToken,
	std::string adAccountId, std::string leadsExportId, 
	void(* handler)(LeadsExportResponseData, Error, void* )
	, void* userData);

/*! \brief Get the lead export from the lead export create call. *Asynchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadsExportId lead_export_id token returned from the create a lead export endpoint *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadsExportGetAsync(char * accessToken,
	std::string adAccountId, std::string leadsExportId, 
	void(* handler)(LeadsExportResponseData, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* LeadsExportManager_H_ */

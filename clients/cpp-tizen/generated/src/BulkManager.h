#ifndef _BulkManager_H_
#define _BulkManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "BulkDownloadRequest.h"
#include "BulkDownloadResponse.h"
#include "BulkUpsertRequest.h"
#include "BulkUpsertResponse.h"
#include "BulkUpsertStatusResponse.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Bulk Bulk
 * \ingroup Operations
 *  @{
 */
class BulkManager {
public:
	BulkManager();
	virtual ~BulkManager();

/*! \brief Get advertiser entities in bulk. *Synchronous*
 *
 * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bulkDownloadRequest Parameters to get ad entities in bulk *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool bulkDownloadCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkDownloadRequest> bulkDownloadRequest, 
	void(* handler)(BulkDownloadResponse, Error, void* )
	, void* userData);

/*! \brief Get advertiser entities in bulk. *Asynchronous*
 *
 * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bulkDownloadRequest Parameters to get ad entities in bulk *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool bulkDownloadCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkDownloadRequest> bulkDownloadRequest, 
	void(* handler)(BulkDownloadResponse, Error, void* )
	, void* userData);


/*! \brief Download advertiser entities in bulk. *Synchronous*
 *
 * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bulkRequestId Unique identifier of a bulk upsert request. *Required*
 * \param includeDetails if set to True then attach the errors/details to all the requests
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool bulkRequestGetSync(char * accessToken,
	std::string adAccountId, std::string bulkRequestId, bool includeDetails, 
	void(* handler)(BulkUpsertStatusResponse, Error, void* )
	, void* userData);

/*! \brief Download advertiser entities in bulk. *Asynchronous*
 *
 * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bulkRequestId Unique identifier of a bulk upsert request. *Required*
 * \param includeDetails if set to True then attach the errors/details to all the requests
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool bulkRequestGetAsync(char * accessToken,
	std::string adAccountId, std::string bulkRequestId, bool includeDetails, 
	void(* handler)(BulkUpsertStatusResponse, Error, void* )
	, void* userData);


/*! \brief Create/update ad entities in bulk. *Synchronous*
 *
 * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bulkUpsertRequest Parameters to get create/update ad entities in bulk *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool bulkUpsertCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkUpsertRequest> bulkUpsertRequest, 
	void(* handler)(BulkUpsertResponse, Error, void* )
	, void* userData);

/*! \brief Create/update ad entities in bulk. *Asynchronous*
 *
 * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bulkUpsertRequest Parameters to get create/update ad entities in bulk *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool bulkUpsertCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BulkUpsertRequest> bulkUpsertRequest, 
	void(* handler)(BulkUpsertResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* BulkManager_H_ */

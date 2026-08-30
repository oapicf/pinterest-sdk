#ifndef _CustomerListUploadsManager_H_
#define _CustomerListUploadsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CustomerListUpload.h"
#include "CustomerListUploadCreateRequest.h"
#include "CustomerListUploadCreateResponse.h"
#include "Pinterest.Lib.Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup CustomerListUploads CustomerListUploads
 * \ingroup Operations
 *  @{
 */
class CustomerListUploadsManager {
public:
	CustomerListUploadsManager();
	virtual ~CustomerListUploadsManager();

/*! \brief Create customer list upload. *Synchronous*
 *
 * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUploadCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsCreateSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUploadCreateRequest> customerListUploadCreateRequest, 
	void(* handler)(CustomerListUploadCreateResponse, Error, void* )
	, void* userData);

/*! \brief Create customer list upload. *Asynchronous*
 *
 * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUploadCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsCreateAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUploadCreateRequest> customerListUploadCreateRequest, 
	void(* handler)(CustomerListUploadCreateResponse, Error, void* )
	, void* userData);


/*! \brief Get customer list upload. *Synchronous*
 *
 * Get the metadata for a given upload by its ID.
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUploadId Customer List Upload ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsGetSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData);

/*! \brief Get customer list upload. *Asynchronous*
 *
 * Get the metadata for a given upload by its ID.
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUploadId Customer List Upload ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsGetAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData);


/*! \brief Run customer list upload. *Synchronous*
 *
 * Begin processing a customer list upload.
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUploadId Customer List Upload ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsRunSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData);

/*! \brief Run customer list upload. *Asynchronous*
 *
 * Begin processing a customer list upload.
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUploadId Customer List Upload ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsRunAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUpload, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CustomerListUploadsManager_H_ */

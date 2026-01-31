#ifndef _CustomerListUploadsManager_H_
#define _CustomerListUploadsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CustomerListUploadCreateRequest.h"
#include "CustomerListUploadCreateResponse.h"
#include "CustomerListUploadResponse.h"
#include "Error.h"
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
 * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUploadCreateRequest Parameters to create a customer list upload request *Required*
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
 * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUploadCreateRequest Parameters to create a customer list upload request *Required*
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
 * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUploadId Unique identifier of a customer list upload *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsGetSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUploadResponse, Error, void* )
	, void* userData);

/*! \brief Get customer list upload. *Asynchronous*
 *
 * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUploadId Unique identifier of a customer list upload *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsGetAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUploadResponse, Error, void* )
	, void* userData);


/*! \brief Run customer list upload. *Synchronous*
 *
 * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUploadId Unique identifier of a customer list upload *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsRunSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUploadResponse, Error, void* )
	, void* userData);

/*! \brief Run customer list upload. *Asynchronous*
 *
 * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUploadId Unique identifier of a customer list upload *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListUploadsRunAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::string customerListUploadId, 
	void(* handler)(CustomerListUploadResponse, Error, void* )
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

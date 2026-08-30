#ifndef _ProductTagsManager_H_
#define _ProductTagsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Pinterest.Lib.Error.h"
#include "ProductTagsBulkAddRequest.h"
#include "ProductTagsBulkDeleteRequest.h"
#include "ProductTagsError.h"
#include "ProductTagsResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ProductTags ProductTags
 * \ingroup Operations
 *  @{
 */
class ProductTagsManager {
public:
	ProductTagsManager();
	virtual ~ProductTagsManager();

/*! \brief Add product tags to pin. *Synchronous*
 *
 * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
 * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
 * \param productTagsBulkAddRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productTagsBulkAddSync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkAddRequest> productTagsBulkAddRequest, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData);

/*! \brief Add product tags to pin. *Asynchronous*
 *
 * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
 * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
 * \param productTagsBulkAddRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productTagsBulkAddAsync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkAddRequest> productTagsBulkAddRequest, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData);


/*! \brief Delete product tags from pin. *Synchronous*
 *
 * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
 * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
 * \param productTagsBulkDeleteRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productTagsBulkDeleteSync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkDeleteRequest> productTagsBulkDeleteRequest, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete product tags from pin. *Asynchronous*
 *
 * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
 * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
 * \param productTagsBulkDeleteRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productTagsBulkDeleteAsync(char * accessToken,
	std::string pinId, std::shared_ptr<ProductTagsBulkDeleteRequest> productTagsBulkDeleteRequest, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get product tags for pin. *Synchronous*
 *
 * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
 * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productTagsListSync(char * accessToken,
	std::string pinId, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData);

/*! \brief Get product tags for pin. *Asynchronous*
 *
 * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
 * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productTagsListAsync(char * accessToken,
	std::string pinId, 
	void(* handler)(ProductTagsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ProductTagsManager_H_ */

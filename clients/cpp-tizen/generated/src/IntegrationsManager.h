#ifndef _IntegrationsManager_H_
#define _IntegrationsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "DetailedError.h"
#include "Error.h"
#include "IntegrationLogsRequest.h"
#include "IntegrationLogsSuccessResponse.h"
#include "IntegrationMetadata.h"
#include "IntegrationRecord.h"
#include "IntegrationRequest.h"
#include "IntegrationRequestPatch.h"
#include "Integrations_get_list_200_response.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Integrations Integrations
 * \ingroup Operations
 *  @{
 */
class IntegrationsManager {
public:
	IntegrationsManager();
	virtual ~IntegrationsManager();

/*! \brief Delete commerce integration. *Synchronous*
 *
 * Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param externalBusinessId External business ID for the integration. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommerceDelSync(char * accessToken,
	std::string externalBusinessId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete commerce integration. *Asynchronous*
 *
 * Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param externalBusinessId External business ID for the integration. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommerceDelAsync(char * accessToken,
	std::string externalBusinessId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get commerce integration. *Synchronous*
 *
 * Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param externalBusinessId External business ID for the integration. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommerceGetSync(char * accessToken,
	std::string externalBusinessId, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData);

/*! \brief Get commerce integration. *Asynchronous*
 *
 * Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param externalBusinessId External business ID for the integration. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommerceGetAsync(char * accessToken,
	std::string externalBusinessId, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData);


/*! \brief Update commerce integration. *Synchronous*
 *
 * Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param externalBusinessId External business ID for the integration. *Required*
 * \param integrationRequestPatch Parameters to get create/update the Integration Metadata
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommercePatchSync(char * accessToken,
	std::string externalBusinessId, std::shared_ptr<IntegrationRequestPatch> integrationRequestPatch, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData);

/*! \brief Update commerce integration. *Asynchronous*
 *
 * Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param externalBusinessId External business ID for the integration. *Required*
 * \param integrationRequestPatch Parameters to get create/update the Integration Metadata
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommercePatchAsync(char * accessToken,
	std::string externalBusinessId, std::shared_ptr<IntegrationRequestPatch> integrationRequestPatch, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData);


/*! \brief Create commerce integration. *Synchronous*
 *
 * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param integrationRequest Parameters to get create/update the Integration Metadata
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommercePostSync(char * accessToken,
	std::shared_ptr<IntegrationRequest> integrationRequest, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData);

/*! \brief Create commerce integration. *Asynchronous*
 *
 * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param integrationRequest Parameters to get create/update the Integration Metadata
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsCommercePostAsync(char * accessToken,
	std::shared_ptr<IntegrationRequest> integrationRequest, 
	void(* handler)(IntegrationMetadata, Error, void* )
	, void* userData);


/*! \brief Get integration metadata. *Synchronous*
 *
 * Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param id Integration ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsGetByIdSync(char * accessToken,
	std::string id, 
	void(* handler)(IntegrationRecord, Error, void* )
	, void* userData);

/*! \brief Get integration metadata. *Asynchronous*
 *
 * Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param id Integration ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsGetByIdAsync(char * accessToken,
	std::string id, 
	void(* handler)(IntegrationRecord, Error, void* )
	, void* userData);


/*! \brief Get integration metadata list. *Synchronous*
 *
 * Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsGetListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Integrations_get_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get integration metadata list. *Asynchronous*
 *
 * Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsGetListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Integrations_get_list_200_response, Error, void* )
	, void* userData);


/*! \brief Receives batched logs from integration applications.. *Synchronous*
 *
 * This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param integrationLogsRequest Ingest log information from external integration application. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsLogsPostSync(char * accessToken,
	std::shared_ptr<IntegrationLogsRequest> integrationLogsRequest, 
	void(* handler)(IntegrationLogsSuccessResponse, Error, void* )
	, void* userData);

/*! \brief Receives batched logs from integration applications.. *Asynchronous*
 *
 * This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
 * \param integrationLogsRequest Ingest log information from external integration application. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool integrationsLogsPostAsync(char * accessToken,
	std::shared_ptr<IntegrationLogsRequest> integrationLogsRequest, 
	void(* handler)(IntegrationLogsSuccessResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* IntegrationsManager_H_ */

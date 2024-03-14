#ifndef _TermsOfServiceManager_H_
#define _TermsOfServiceManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "TermsOfService.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup TermsOfService TermsOfService
 * \ingroup Operations
 *  @{
 */
class TermsOfServiceManager {
public:
	TermsOfServiceManager();
	virtual ~TermsOfServiceManager();

/*! \brief Get terms of service. *Synchronous*
 *
 * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param includeHtml Return HTML in TOS text.
 * \param tosType Request type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool termsOfServiceGetSync(char * accessToken,
	std::string adAccountId, bool includeHtml, std::string tosType, 
	void(* handler)(TermsOfService, Error, void* )
	, void* userData);

/*! \brief Get terms of service. *Asynchronous*
 *
 * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param includeHtml Return HTML in TOS text.
 * \param tosType Request type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool termsOfServiceGetAsync(char * accessToken,
	std::string adAccountId, bool includeHtml, std::string tosType, 
	void(* handler)(TermsOfService, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* TermsOfServiceManager_H_ */

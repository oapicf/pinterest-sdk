#ifndef _ConversionTagsManager_H_
#define _ConversionTagsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ConversionEventResponse.h"
#include "ConversionTagCreate.h"
#include "ConversionTagListResponse.h"
#include "ConversionTagResponse.h"
#include "Error.h"
#include "Page_visit_conversion_tags_get_200_response.h"
#include <list>
#include <map>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ConversionTags ConversionTags
 * \ingroup Operations
 *  @{
 */
class ConversionTagsManager {
public:
	ConversionTagsManager();
	virtual ~ConversionTagsManager();

/*! \brief Create conversion tag. *Synchronous*
 *
 * Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionTagCreate Conversion Tag to create *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionTagsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionTagCreate> conversionTagCreate, 
	void(* handler)(ConversionTagResponse, Error, void* )
	, void* userData);

/*! \brief Create conversion tag. *Asynchronous*
 *
 * Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionTagCreate Conversion Tag to create *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionTagsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionTagCreate> conversionTagCreate, 
	void(* handler)(ConversionTagResponse, Error, void* )
	, void* userData);


/*! \brief Get conversion tag. *Synchronous*
 *
 * Get information about an existing conversion tag.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionTagId Id of the conversion tag. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionTagsGetSync(char * accessToken,
	std::string adAccountId, std::string conversionTagId, 
	void(* handler)(ConversionTagResponse, Error, void* )
	, void* userData);

/*! \brief Get conversion tag. *Asynchronous*
 *
 * Get information about an existing conversion tag.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionTagId Id of the conversion tag. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionTagsGetAsync(char * accessToken,
	std::string adAccountId, std::string conversionTagId, 
	void(* handler)(ConversionTagResponse, Error, void* )
	, void* userData);


/*! \brief Get conversion tags. *Synchronous*
 *
 * List conversion tags associated with an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param filterDeleted Filter out deleted tags.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionTagsListSync(char * accessToken,
	std::string adAccountId, bool filterDeleted, 
	void(* handler)(ConversionTagListResponse, Error, void* )
	, void* userData);

/*! \brief Get conversion tags. *Asynchronous*
 *
 * List conversion tags associated with an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param filterDeleted Filter out deleted tags.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionTagsListAsync(char * accessToken,
	std::string adAccountId, bool filterDeleted, 
	void(* handler)(ConversionTagListResponse, Error, void* )
	, void* userData);


/*! \brief Get Ocpm eligible conversion tags. *Synchronous*
 *
 * Get Ocpm eligible conversion tag events for an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ocpmEligibleConversionTagsGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);

/*! \brief Get Ocpm eligible conversion tags. *Asynchronous*
 *
 * Get Ocpm eligible conversion tag events for an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ocpmEligibleConversionTagsGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);


/*! \brief Get page visit conversion tags. *Synchronous*
 *
 * Get all page visit conversion tag events for an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pageVisitConversionTagsGetSync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Page_visit_conversion_tags_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get page visit conversion tags. *Asynchronous*
 *
 * Get all page visit conversion tag events for an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pageVisitConversionTagsGetAsync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Page_visit_conversion_tags_get_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ConversionTagsManager_H_ */

#ifndef _KeywordsManager_H_
#define _KeywordsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "KeywordUpdateBody.h"
#include "KeywordsMetricsArrayResponse.h"
#include "KeywordsRequest.h"
#include "KeywordsResponse.h"
#include "Keywords_get_200_response.h"
#include "MatchType.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Keywords Keywords
 * \ingroup Operations
 *  @{
 */
class KeywordsManager {
public:
	KeywordsManager();
	virtual ~KeywordsManager();

/*! \brief Get country's keyword metrics. *Synchronous*
 *
 * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param countryCode Two letter country code (ISO 3166-1 alpha-2) *Required*
 * \param keywords Comma-separated keywords *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool countryKeywordsMetricsGetSync(char * accessToken,
	std::string adAccountId, std::string countryCode, std::list<std::string> keywords, 
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
	, void* userData);

/*! \brief Get country's keyword metrics. *Asynchronous*
 *
 * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param countryCode Two letter country code (ISO 3166-1 alpha-2) *Required*
 * \param keywords Comma-separated keywords *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool countryKeywordsMetricsGetAsync(char * accessToken,
	std::string adAccountId, std::string countryCode, std::list<std::string> keywords, 
	void(* handler)(KeywordsMetricsArrayResponse, Error, void* )
	, void* userData);


/*! \brief Create keywords. *Synchronous*
 *
 * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a href=\"/docs/redoc/#section/Match-type-(keyword)\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordsRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsRequest> keywordsRequest, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData);

/*! \brief Create keywords. *Asynchronous*
 *
 * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a href=\"/docs/redoc/#section/Match-type-(keyword)\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordsRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordsRequest> keywordsRequest, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData);


/*! \brief Get keywords. *Synchronous*
 *
 * <p>Get a list of keywords based on the filters provided.</p><p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a href=\"/docs/redoc/#section/Match-type-(keyword)\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignId Campaign Id to use to filter the results.
 * \param adGroupId Ad group Id.
 * \param matchTypes Keyword <a href=\"/docs/redoc/#section/Match-type-(keyword).\">match type</a>
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsGetSync(char * accessToken,
	std::string adAccountId, std::string campaignId, std::string adGroupId, std::list<MatchType> matchTypes, int pageSize, std::string bookmark, 
	void(* handler)(Keywords_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get keywords. *Asynchronous*
 *
 * <p>Get a list of keywords based on the filters provided.</p><p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a href=\"/docs/redoc/#section/Match-type-(keyword)\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignId Campaign Id to use to filter the results.
 * \param adGroupId Ad group Id.
 * \param matchTypes Keyword <a href=\"/docs/redoc/#section/Match-type-(keyword).\">match type</a>
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsGetAsync(char * accessToken,
	std::string adAccountId, std::string campaignId, std::string adGroupId, std::list<MatchType> matchTypes, int pageSize, std::string bookmark, 
	void(* handler)(Keywords_get_200_response, Error, void* )
	, void* userData);


/*! \brief Update keywords. *Synchronous*
 *
 * <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordUpdateBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordUpdateBody> keywordUpdateBody, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData);

/*! \brief Update keywords. *Asynchronous*
 *
 * <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param keywordUpdateBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keywordsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<KeywordUpdateBody> keywordUpdateBody, 
	void(* handler)(KeywordsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* KeywordsManager_H_ */

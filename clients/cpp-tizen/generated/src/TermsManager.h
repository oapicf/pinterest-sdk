#ifndef _TermsManager_H_
#define _TermsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "RelatedTerms.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Terms Terms
 * \ingroup Operations
 *  @{
 */
class TermsManager {
public:
	TermsManager();
	virtual ~TermsManager();

/*! \brief List related terms. *Synchronous*
 *
 * Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
 * \param terms List of input terms. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool termsRelatedListSync(char * accessToken,
	std::list<std::string> terms, 
	void(* handler)(RelatedTerms, Error, void* )
	, void* userData);

/*! \brief List related terms. *Asynchronous*
 *
 * Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
 * \param terms List of input terms. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool termsRelatedListAsync(char * accessToken,
	std::list<std::string> terms, 
	void(* handler)(RelatedTerms, Error, void* )
	, void* userData);


/*! \brief List suggested terms. *Synchronous*
 *
 * Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
 * \param term Input term. *Required*
 * \param limit Max suggested terms to return.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool termsSuggestedListSync(char * accessToken,
	std::string term, int limit, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief List suggested terms. *Asynchronous*
 *
 * Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
 * \param term Input term. *Required*
 * \param limit Max suggested terms to return.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool termsSuggestedListAsync(char * accessToken,
	std::string term, int limit, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* TermsManager_H_ */

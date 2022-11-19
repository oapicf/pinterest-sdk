/*
 * MatchTypeResponse.h
 *
 * Keyword match type
 */

#ifndef _MatchTypeResponse_H_
#define _MatchTypeResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Keyword match type
 *
 *  \ingroup Models
 *
 */

class MatchTypeResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	MatchTypeResponse();
	MatchTypeResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MatchTypeResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _MatchTypeResponse_H_ */

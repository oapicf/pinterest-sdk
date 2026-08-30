/*
 * TieBreakerType.h
 *
 * Quiz ad tie breaker type, default is RANDOM
 */

#ifndef _TieBreakerType_H_
#define _TieBreakerType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Quiz ad tie breaker type, default is RANDOM
 *
 *  \ingroup Models
 *
 */

class TieBreakerType : public Object {
public:
	/*! \brief Constructor.
	 */
	TieBreakerType();
	TieBreakerType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TieBreakerType();

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

#endif /* _TieBreakerType_H_ */

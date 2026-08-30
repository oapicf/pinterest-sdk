/*
 * TokenGrantType.h
 *
 * The type of OAuth grant being requested.
 */

#ifndef _TokenGrantType_H_
#define _TokenGrantType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The type of OAuth grant being requested.
 *
 *  \ingroup Models
 *
 */

class TokenGrantType : public Object {
public:
	/*! \brief Constructor.
	 */
	TokenGrantType();
	TokenGrantType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TokenGrantType();

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

#endif /* _TokenGrantType_H_ */

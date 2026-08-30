/*
 * TokenTypeHint.h
 *
 * The type of token to revoke.
 */

#ifndef _TokenTypeHint_H_
#define _TokenTypeHint_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The type of token to revoke.
 *
 *  \ingroup Models
 *
 */

class TokenTypeHint : public Object {
public:
	/*! \brief Constructor.
	 */
	TokenTypeHint();
	TokenTypeHint(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TokenTypeHint();

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

#endif /* _TokenTypeHint_H_ */

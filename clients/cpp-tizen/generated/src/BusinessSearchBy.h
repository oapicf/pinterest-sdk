/*
 * BusinessSearchBy.h
 *
 * The names of fields that business accounts are searched by
 */

#ifndef _BusinessSearchBy_H_
#define _BusinessSearchBy_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The names of fields that business accounts are searched by
 *
 *  \ingroup Models
 *
 */

class BusinessSearchBy : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessSearchBy();
	BusinessSearchBy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessSearchBy();

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

#endif /* _BusinessSearchBy_H_ */

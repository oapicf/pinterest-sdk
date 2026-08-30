/*
 * QueryvideopinmetrictypesItems.h
 *
 * 
 */

#ifndef _QueryvideopinmetrictypesItems_H_
#define _QueryvideopinmetrictypesItems_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class QueryvideopinmetrictypesItems : public Object {
public:
	/*! \brief Constructor.
	 */
	QueryvideopinmetrictypesItems();
	QueryvideopinmetrictypesItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QueryvideopinmetrictypesItems();

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

#endif /* _QueryvideopinmetrictypesItems_H_ */

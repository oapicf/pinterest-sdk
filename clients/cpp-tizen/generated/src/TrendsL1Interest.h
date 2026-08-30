/*
 * TrendsL1Interest.h
 *
 * L1 interest categories for filtering trends.
 */

#ifndef _TrendsL1Interest_H_
#define _TrendsL1Interest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief L1 interest categories for filtering trends.
 *
 *  \ingroup Models
 *
 */

class TrendsL1Interest : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendsL1Interest();
	TrendsL1Interest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendsL1Interest();

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

#endif /* _TrendsL1Interest_H_ */

/*
 * BoardPrivacyFilter.h
 *
 * 
 */

#ifndef _BoardPrivacyFilter_H_
#define _BoardPrivacyFilter_H_


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

class BoardPrivacyFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardPrivacyFilter();
	BoardPrivacyFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardPrivacyFilter();

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

#endif /* _BoardPrivacyFilter_H_ */

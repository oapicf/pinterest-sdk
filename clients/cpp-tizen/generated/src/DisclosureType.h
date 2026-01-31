/*
 * DisclosureType.h
 *
 * Type of information in the page referenced by &#x60;disclosure_url&#x60;, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */

#ifndef _DisclosureType_H_
#define _DisclosureType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 *
 *  \ingroup Models
 *
 */

class DisclosureType : public Object {
public:
	/*! \brief Constructor.
	 */
	DisclosureType();
	DisclosureType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DisclosureType();

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

#endif /* _DisclosureType_H_ */

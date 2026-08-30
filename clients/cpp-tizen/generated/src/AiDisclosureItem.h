/*
 * AiDisclosureItem.h
 *
 * AI disclosure declaration the creator has made about the Pin.
 */

#ifndef _AiDisclosureItem_H_
#define _AiDisclosureItem_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief AI disclosure declaration the creator has made about the Pin.
 *
 *  \ingroup Models
 *
 */

class AiDisclosureItem : public Object {
public:
	/*! \brief Constructor.
	 */
	AiDisclosureItem();
	AiDisclosureItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AiDisclosureItem();

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

#endif /* _AiDisclosureItem_H_ */

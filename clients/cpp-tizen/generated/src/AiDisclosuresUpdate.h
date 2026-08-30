/*
 * AiDisclosuresUpdate.h
 *
 * AI disclosure declarations the creator has made about the Pin.
 */

#ifndef _AiDisclosuresUpdate_H_
#define _AiDisclosuresUpdate_H_


#include <string>
#include "AiDisclosureItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief AI disclosure declarations the creator has made about the Pin.
 *
 *  \ingroup Models
 *
 */

class AiDisclosuresUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	AiDisclosuresUpdate();
	AiDisclosuresUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AiDisclosuresUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of AI disclosure declarations the creator has made about this Pin.
	 */
	std::list<AiDisclosureItem> getValues();

	/*! \brief Set List of AI disclosure declarations the creator has made about this Pin.
	 */
	void setValues(std::list <AiDisclosureItem> values);

private:
	std::list <AiDisclosureItem>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AiDisclosuresUpdate_H_ */

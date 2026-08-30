/*
 * ConversionEventsCreate.h
 *
 * Conversion events.
 */

#ifndef _ConversionEventsCreate_H_
#define _ConversionEventsCreate_H_


#include <string>
#include "ConversionEventsDataItems.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion events.
 *
 *  \ingroup Models
 *
 */

class ConversionEventsCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventsCreate();
	ConversionEventsCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventsCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of events (one or more) encapsulated by a data object.
	 */
	std::list<ConversionEventsDataItems> getData();

	/*! \brief Set A list of events (one or more) encapsulated by a data object.
	 */
	void setData(std::list <ConversionEventsDataItems> data);

private:
	std::list <ConversionEventsDataItems>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventsCreate_H_ */

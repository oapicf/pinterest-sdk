/*
 * ConversionEvents.h
 *
 * A list of events (one or more) encapsulated by a data object.
 */

#ifndef _ConversionEvents_H_
#define _ConversionEvents_H_


#include <string>
#include "ConversionEvents_data_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A list of events (one or more) encapsulated by a data object.
 *
 *  \ingroup Models
 *
 */

class ConversionEvents : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEvents();
	ConversionEvents(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEvents();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ConversionEvents_data_inner> getData();

	/*! \brief Set 
	 */
	void setData(std::list <ConversionEvents_data_inner> data);

private:
	std::list <ConversionEvents_data_inner>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEvents_H_ */

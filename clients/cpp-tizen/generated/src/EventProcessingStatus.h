/*
 * EventProcessingStatus.h
 *
 * Status of a single event in the response.
 */

#ifndef _EventProcessingStatus_H_
#define _EventProcessingStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Status of a single event in the response.
 *
 *  \ingroup Models
 *
 */

class EventProcessingStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	EventProcessingStatus();
	EventProcessingStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EventProcessingStatus();

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

#endif /* _EventProcessingStatus_H_ */

/*
 * ConversionEvents.h
 *
 * Conversion events.
 */

#ifndef _ConversionEvents_H_
#define _ConversionEvents_H_


#include <string>
#include "ConversionApiResponseEventsItems.h"
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

	/*! \brief Get Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	std::list<ConversionApiResponseEventsItems> getEvents();

	/*! \brief Set Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	void setEvents(std::list <ConversionApiResponseEventsItems> events);
	/*! \brief Get Number of events that were successfully processed from the events.
	 */
	int getNumEventsProcessed();

	/*! \brief Set Number of events that were successfully processed from the events.
	 */
	void setNumEventsProcessed(int  num_events_processed);
	/*! \brief Get Total number of events received in the request.
	 */
	int getNumEventsReceived();

	/*! \brief Set Total number of events received in the request.
	 */
	void setNumEventsReceived(int  num_events_received);

private:
	std::list <ConversionApiResponseEventsItems>events;
	int num_events_processed;
	int num_events_received;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEvents_H_ */

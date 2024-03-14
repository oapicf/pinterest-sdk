/*
 * ConversionApiResponse.h
 *
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 */

#ifndef _ConversionApiResponse_H_
#define _ConversionApiResponse_H_


#include <string>
#include "ConversionApiResponse_events_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Schema describing the object in the response, which contains information about the events that were received and processed.
 *
 *  \ingroup Models
 *
 */

class ConversionApiResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionApiResponse();
	ConversionApiResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionApiResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Total number of events received in the request.
	 */
	int getNumEventsReceived();

	/*! \brief Set Total number of events received in the request.
	 */
	void setNumEventsReceived(int  num_events_received);
	/*! \brief Get Number of events that were successfully processed from the events.
	 */
	int getNumEventsProcessed();

	/*! \brief Set Number of events that were successfully processed from the events.
	 */
	void setNumEventsProcessed(int  num_events_processed);
	/*! \brief Get Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	std::list<ConversionApiResponse_events_inner> getEvents();

	/*! \brief Set Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	void setEvents(std::list <ConversionApiResponse_events_inner> events);

private:
	int num_events_received;
	int num_events_processed;
	std::list <ConversionApiResponse_events_inner>events;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionApiResponse_H_ */

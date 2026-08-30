
/*
 * ConversionEvents.h
 *
 * Conversion events.
 */

#ifndef TINY_CPP_CLIENT_ConversionEvents_H_
#define TINY_CPP_CLIENT_ConversionEvents_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionApiResponseEventsItems.h"
#include <list>

namespace Tiny {


/*! \brief Conversion events.
 *
 *  \ingroup Models
 *
 */

class ConversionEvents{
public:

    /*! \brief Constructor.
	 */
    ConversionEvents();
    ConversionEvents(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionEvents();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	std::list<ConversionApiResponseEventsItems> getEvents();

	/*! \brief Set Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	void setEvents(std::list<ConversionApiResponseEventsItems> events);
	/*! \brief Get Number of events that were successfully processed from the events.
	 */
	int getNumEventsProcessed();

	/*! \brief Set Number of events that were successfully processed from the events.
	 */
	void setNumEventsProcessed(int num_events_processed);
	/*! \brief Get Total number of events received in the request.
	 */
	int getNumEventsReceived();

	/*! \brief Set Total number of events received in the request.
	 */
	void setNumEventsReceived(int num_events_received);


    private:
    std::list<ConversionApiResponseEventsItems> events;
    int num_events_processed{};
    int num_events_received{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionEvents_H_ */

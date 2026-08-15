
/*
 * ConversionApiResponse.h
 *
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 */

#ifndef TINY_CPP_CLIENT_ConversionApiResponse_H_
#define TINY_CPP_CLIENT_ConversionApiResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionApiResponse_events_inner.h"
#include <list>

namespace Tiny {


/*! \brief Schema describing the object in the response, which contains information about the events that were received and processed.
 *
 *  \ingroup Models
 *
 */

class ConversionApiResponse{
public:

    /*! \brief Constructor.
	 */
    ConversionApiResponse();
    ConversionApiResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionApiResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	std::list<ConversionApiResponse_events_inner> getEvents();

	/*! \brief Set Specific messages for each event received. The order will match the order in which the events were received in the request.
	 */
	void setEvents(std::list <ConversionApiResponse_events_inner> events);
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
    std::list<ConversionApiResponse_events_inner> events;
    int num_events_processed{};
    int num_events_received{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionApiResponse_H_ */

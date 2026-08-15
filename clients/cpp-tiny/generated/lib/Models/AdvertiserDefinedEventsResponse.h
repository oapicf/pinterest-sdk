
/*
 * AdvertiserDefinedEventsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdvertiserDefinedEventsResponse_H_
#define TINY_CPP_CLIENT_AdvertiserDefinedEventsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvertiserDefinedEvent.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventsResponse{
public:

    /*! \brief Constructor.
	 */
    AdvertiserDefinedEventsResponse();
    AdvertiserDefinedEventsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvertiserDefinedEventsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdvertiserDefinedEvent> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdvertiserDefinedEvent> items);


    private:
    std::list<AdvertiserDefinedEvent> items;
};
}

#endif /* TINY_CPP_CLIENT_AdvertiserDefinedEventsResponse_H_ */

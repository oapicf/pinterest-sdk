
/*
 * AdvertiserDefinedEventsCreateRequest.h
 *
 * Request body for creating or updating advertiser defined events
 */

#ifndef TINY_CPP_CLIENT_AdvertiserDefinedEventsCreateRequest_H_
#define TINY_CPP_CLIENT_AdvertiserDefinedEventsCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvertiserDefinedEventInput.h"
#include <list>

namespace Tiny {


/*! \brief Request body for creating or updating advertiser defined events
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventsCreateRequest{
public:

    /*! \brief Constructor.
	 */
    AdvertiserDefinedEventsCreateRequest();
    AdvertiserDefinedEventsCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvertiserDefinedEventsCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of advertiser defined events to create or update
	 */
	std::list<AdvertiserDefinedEventInput> getItems();

	/*! \brief Set List of advertiser defined events to create or update
	 */
	void setItems(std::list<AdvertiserDefinedEventInput> items);


    private:
    std::list<AdvertiserDefinedEventInput> items;
};
}

#endif /* TINY_CPP_CLIENT_AdvertiserDefinedEventsCreateRequest_H_ */

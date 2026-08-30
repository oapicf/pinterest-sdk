
/*
 * Advertiser_defined_events_create_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Advertiser_defined_events_create_200_response_H_
#define TINY_CPP_CLIENT_Advertiser_defined_events_create_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvertiserDefinedEventProcessingRecord.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Advertiser_defined_events_create_200_response{
public:

    /*! \brief Constructor.
	 */
    Advertiser_defined_events_create_200_response();
    Advertiser_defined_events_create_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Advertiser_defined_events_create_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdvertiserDefinedEventProcessingRecord> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<AdvertiserDefinedEventProcessingRecord> items);


    private:
    std::list<AdvertiserDefinedEventProcessingRecord> items;
};
}

#endif /* TINY_CPP_CLIENT_Advertiser_defined_events_create_200_response_H_ */

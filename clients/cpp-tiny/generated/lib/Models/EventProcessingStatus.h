
/*
 * EventProcessingStatus.h
 *
 * Status of a single event in the response.
 */

#ifndef TINY_CPP_CLIENT_EventProcessingStatus_H_
#define TINY_CPP_CLIENT_EventProcessingStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Status of a single event in the response.
 *
 *  \ingroup Models
 *
 */

class EventProcessingStatus{
public:

    /*! \brief Constructor.
	 */
    EventProcessingStatus();
    EventProcessingStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EventProcessingStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_EventProcessingStatus_H_ */

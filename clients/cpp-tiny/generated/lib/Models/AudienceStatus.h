
/*
 * AudienceStatus.h
 *
 * Audience processing status
 */

#ifndef TINY_CPP_CLIENT_AudienceStatus_H_
#define TINY_CPP_CLIENT_AudienceStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Audience processing status
 *
 *  \ingroup Models
 *
 */

class AudienceStatus{
public:

    /*! \brief Constructor.
	 */
    AudienceStatus();
    AudienceStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AudienceStatus_H_ */

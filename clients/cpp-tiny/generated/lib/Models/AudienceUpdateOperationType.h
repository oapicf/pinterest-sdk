
/*
 * AudienceUpdateOperationType.h
 *
 * Audience operation type (update or remove).
 */

#ifndef TINY_CPP_CLIENT_AudienceUpdateOperationType_H_
#define TINY_CPP_CLIENT_AudienceUpdateOperationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Audience operation type (update or remove).
 *
 *  \ingroup Models
 *
 */

class AudienceUpdateOperationType{
public:

    /*! \brief Constructor.
	 */
    AudienceUpdateOperationType();
    AudienceUpdateOperationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceUpdateOperationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AudienceUpdateOperationType_H_ */

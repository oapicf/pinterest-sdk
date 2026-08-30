
/*
 * AudienceObjectiveType.h
 *
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 */

#ifndef TINY_CPP_CLIENT_AudienceObjectiveType_H_
#define TINY_CPP_CLIENT_AudienceObjectiveType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 *
 *  \ingroup Models
 *
 */

class AudienceObjectiveType{
public:

    /*! \brief Constructor.
	 */
    AudienceObjectiveType();
    AudienceObjectiveType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceObjectiveType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AudienceObjectiveType_H_ */


/*
 * ObjectiveType.h
 *
 * Advertiser campaign objective type. You can only update objectives for draft campaigns. &#x60;CTV_CONSIDERATION&#x60; is in BETA. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 */

#ifndef TINY_CPP_CLIENT_ObjectiveType_H_
#define TINY_CPP_CLIENT_ObjectiveType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
 *
 *  \ingroup Models
 *
 */

class ObjectiveType{
public:

    /*! \brief Constructor.
	 */
    ObjectiveType();
    ObjectiveType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ObjectiveType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ObjectiveType_H_ */

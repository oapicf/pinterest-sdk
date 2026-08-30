
/*
 * IneligibleProductTagReason.h
 *
 * Reason why a product pin is ineligible for tagging.
 */

#ifndef TINY_CPP_CLIENT_IneligibleProductTagReason_H_
#define TINY_CPP_CLIENT_IneligibleProductTagReason_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reason why a product pin is ineligible for tagging.
 *
 *  \ingroup Models
 *
 */

class IneligibleProductTagReason{
public:

    /*! \brief Constructor.
	 */
    IneligibleProductTagReason();
    IneligibleProductTagReason(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IneligibleProductTagReason();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_IneligibleProductTagReason_H_ */

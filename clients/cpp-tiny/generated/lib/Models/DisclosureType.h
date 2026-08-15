
/*
 * DisclosureType.h
 *
 * Type of information in the page referenced by &#x60;disclosure_url&#x60;, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */

#ifndef TINY_CPP_CLIENT_DisclosureType_H_
#define TINY_CPP_CLIENT_DisclosureType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 *
 *  \ingroup Models
 *
 */

class DisclosureType{
public:

    /*! \brief Constructor.
	 */
    DisclosureType();
    DisclosureType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DisclosureType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_DisclosureType_H_ */

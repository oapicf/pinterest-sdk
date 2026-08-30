
/*
 * AiDisclosureItem.h
 *
 * AI disclosure declaration the creator has made about the Pin.
 */

#ifndef TINY_CPP_CLIENT_AiDisclosureItem_H_
#define TINY_CPP_CLIENT_AiDisclosureItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief AI disclosure declaration the creator has made about the Pin.
 *
 *  \ingroup Models
 *
 */

class AiDisclosureItem{
public:

    /*! \brief Constructor.
	 */
    AiDisclosureItem();
    AiDisclosureItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AiDisclosureItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AiDisclosureItem_H_ */


/*
 * AiDisclosuresUpdate.h
 *
 * AI disclosure declarations the creator has made about the Pin.
 */

#ifndef TINY_CPP_CLIENT_AiDisclosuresUpdate_H_
#define TINY_CPP_CLIENT_AiDisclosuresUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AiDisclosureItem.h"
#include <list>

namespace Tiny {


/*! \brief AI disclosure declarations the creator has made about the Pin.
 *
 *  \ingroup Models
 *
 */

class AiDisclosuresUpdate{
public:

    /*! \brief Constructor.
	 */
    AiDisclosuresUpdate();
    AiDisclosuresUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AiDisclosuresUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of AI disclosure declarations the creator has made about this Pin.
	 */
	std::list<AiDisclosureItem> getValues();

	/*! \brief Set List of AI disclosure declarations the creator has made about this Pin.
	 */
	void setValues(std::list<AiDisclosureItem> values);


    private:
    std::list<AiDisclosureItem> values;
};
}

#endif /* TINY_CPP_CLIENT_AiDisclosuresUpdate_H_ */

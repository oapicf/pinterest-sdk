
/*
 * AttributionScope.h
 *
 * Ad event type used for attribution.
 */

#ifndef TINY_CPP_CLIENT_AttributionScope_H_
#define TINY_CPP_CLIENT_AttributionScope_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ad event type used for attribution.
 *
 *  \ingroup Models
 *
 */

class AttributionScope{
public:

    /*! \brief Constructor.
	 */
    AttributionScope();
    AttributionScope(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AttributionScope();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AttributionScope_H_ */

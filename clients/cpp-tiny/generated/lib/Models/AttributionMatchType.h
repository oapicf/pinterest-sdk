
/*
 * AttributionMatchType.h
 *
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */

#ifndef TINY_CPP_CLIENT_AttributionMatchType_H_
#define TINY_CPP_CLIENT_AttributionMatchType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 *
 *  \ingroup Models
 *
 */

class AttributionMatchType{
public:

    /*! \brief Constructor.
	 */
    AttributionMatchType();
    AttributionMatchType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AttributionMatchType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AttributionMatchType_H_ */

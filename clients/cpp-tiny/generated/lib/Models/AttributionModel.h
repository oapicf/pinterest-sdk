
/*
 * AttributionModel.h
 *
 * Attribution model used to attribute the conversion event.
 */

#ifndef TINY_CPP_CLIENT_AttributionModel_H_
#define TINY_CPP_CLIENT_AttributionModel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Attribution model used to attribute the conversion event.
 *
 *  \ingroup Models
 *
 */

class AttributionModel{
public:

    /*! \brief Constructor.
	 */
    AttributionModel();
    AttributionModel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AttributionModel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AttributionModel_H_ */

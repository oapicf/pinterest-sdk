
/*
 * ConversionProductAttributionType.h
 *
 * Conversion product attribution level
 */

#ifndef TINY_CPP_CLIENT_ConversionProductAttributionType_H_
#define TINY_CPP_CLIENT_ConversionProductAttributionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Conversion product attribution level
 *
 *  \ingroup Models
 *
 */

class ConversionProductAttributionType{
public:

    /*! \brief Constructor.
	 */
    ConversionProductAttributionType();
    ConversionProductAttributionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionProductAttributionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionProductAttributionType_H_ */

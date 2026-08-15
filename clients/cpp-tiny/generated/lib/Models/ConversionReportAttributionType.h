
/*
 * ConversionReportAttributionType.h
 *
 * Attribution type. Refers to the Pinterest Tag endpoints
 */

#ifndef TINY_CPP_CLIENT_ConversionReportAttributionType_H_
#define TINY_CPP_CLIENT_ConversionReportAttributionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Attribution type. Refers to the Pinterest Tag endpoints
 *
 *  \ingroup Models
 *
 */

class ConversionReportAttributionType{
public:

    /*! \brief Constructor.
	 */
    ConversionReportAttributionType();
    ConversionReportAttributionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionReportAttributionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionReportAttributionType_H_ */

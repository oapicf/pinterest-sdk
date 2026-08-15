
/*
 * ConversionReportTimeType.h
 *
 * Conversion report time type
 */

#ifndef TINY_CPP_CLIENT_ConversionReportTimeType_H_
#define TINY_CPP_CLIENT_ConversionReportTimeType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Conversion report time type
 *
 *  \ingroup Models
 *
 */

class ConversionReportTimeType{
public:

    /*! \brief Constructor.
	 */
    ConversionReportTimeType();
    ConversionReportTimeType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionReportTimeType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionReportTimeType_H_ */

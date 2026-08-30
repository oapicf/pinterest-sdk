
/*
 * ConversionProductReportLevel.h
 *
 * Level of the report
 */

#ifndef TINY_CPP_CLIENT_ConversionProductReportLevel_H_
#define TINY_CPP_CLIENT_ConversionProductReportLevel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Level of the report
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportLevel{
public:

    /*! \brief Constructor.
	 */
    ConversionProductReportLevel();
    ConversionProductReportLevel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionProductReportLevel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionProductReportLevel_H_ */

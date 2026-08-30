
/*
 * ConversionProductReportBreakdownType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionProductReportBreakdownType_H_
#define TINY_CPP_CLIENT_ConversionProductReportBreakdownType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportBreakdownType{
public:

    /*! \brief Constructor.
	 */
    ConversionProductReportBreakdownType();
    ConversionProductReportBreakdownType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionProductReportBreakdownType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionProductReportBreakdownType_H_ */

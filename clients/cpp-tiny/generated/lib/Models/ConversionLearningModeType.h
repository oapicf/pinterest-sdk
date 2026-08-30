
/*
 * ConversionLearningModeType.h
 *
 * oCPM learn mode.
 */

#ifndef TINY_CPP_CLIENT_ConversionLearningModeType_H_
#define TINY_CPP_CLIENT_ConversionLearningModeType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief oCPM learn mode.
 *
 *  \ingroup Models
 *
 */

class ConversionLearningModeType{
public:

    /*! \brief Constructor.
	 */
    ConversionLearningModeType();
    ConversionLearningModeType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionLearningModeType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionLearningModeType_H_ */

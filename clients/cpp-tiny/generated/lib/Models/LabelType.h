
/*
 * LabelType.h
 *
 * Label type values.
 */

#ifndef TINY_CPP_CLIENT_LabelType_H_
#define TINY_CPP_CLIENT_LabelType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Label type values.
 *
 *  \ingroup Models
 *
 */

class LabelType{
public:

    /*! \brief Constructor.
	 */
    LabelType();
    LabelType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LabelType_H_ */

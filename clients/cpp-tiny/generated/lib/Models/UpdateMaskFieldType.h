
/*
 * UpdateMaskFieldType.h
 *
 * The field types supported by the update mask
 */

#ifndef TINY_CPP_CLIENT_UpdateMaskFieldType_H_
#define TINY_CPP_CLIENT_UpdateMaskFieldType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The field types supported by the update mask
 *
 *  \ingroup Models
 *
 */

class UpdateMaskFieldType{
public:

    /*! \brief Constructor.
	 */
    UpdateMaskFieldType();
    UpdateMaskFieldType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMaskFieldType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_UpdateMaskFieldType_H_ */

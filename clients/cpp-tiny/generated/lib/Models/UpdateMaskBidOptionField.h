
/*
 * UpdateMaskBidOptionField.h
 *
 * bid option field to apply operation updates to
 */

#ifndef TINY_CPP_CLIENT_UpdateMaskBidOptionField_H_
#define TINY_CPP_CLIENT_UpdateMaskBidOptionField_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief bid option field to apply operation updates to
 *
 *  \ingroup Models
 *
 */

class UpdateMaskBidOptionField{
public:

    /*! \brief Constructor.
	 */
    UpdateMaskBidOptionField();
    UpdateMaskBidOptionField(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMaskBidOptionField();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_UpdateMaskBidOptionField_H_ */

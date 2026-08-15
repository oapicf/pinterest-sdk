
/*
 * ItemProcessingStatus.h
 *
 * The status of the item processing record
 */

#ifndef TINY_CPP_CLIENT_ItemProcessingStatus_H_
#define TINY_CPP_CLIENT_ItemProcessingStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The status of the item processing record
 *
 *  \ingroup Models
 *
 */

class ItemProcessingStatus{
public:

    /*! \brief Constructor.
	 */
    ItemProcessingStatus();
    ItemProcessingStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemProcessingStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ItemProcessingStatus_H_ */


/*
 * LabelStatusBulkUpdate.h
 *
 * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
 */

#ifndef TINY_CPP_CLIENT_LabelStatusBulkUpdate_H_
#define TINY_CPP_CLIENT_LabelStatusBulkUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Set status to `ARCHIVED` to remove the label from the parent entity.
 *
 *  \ingroup Models
 *
 */

class LabelStatusBulkUpdate{
public:

    /*! \brief Constructor.
	 */
    LabelStatusBulkUpdate();
    LabelStatusBulkUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelStatusBulkUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LabelStatusBulkUpdate_H_ */

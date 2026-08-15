
/*
 * LabelStatus.h
 *
 * The new status you want to give the label, either &#x60;ACTIVE&#x60; (in use) or no longer in use (&#x60;ARCHIVED&#x60;).
 */

#ifndef TINY_CPP_CLIENT_LabelStatus_H_
#define TINY_CPP_CLIENT_LabelStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
 *
 *  \ingroup Models
 *
 */

class LabelStatus{
public:

    /*! \brief Constructor.
	 */
    LabelStatus();
    LabelStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LabelStatus_H_ */

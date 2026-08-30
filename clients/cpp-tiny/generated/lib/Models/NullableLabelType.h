
/*
 * NullableLabelType.h
 *
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */

#ifndef TINY_CPP_CLIENT_NullableLabelType_H_
#define TINY_CPP_CLIENT_NullableLabelType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 *
 *  \ingroup Models
 *
 */

class NullableLabelType{
public:

    /*! \brief Constructor.
	 */
    NullableLabelType();
    NullableLabelType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NullableLabelType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NullableLabelType_H_ */

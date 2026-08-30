
/*
 * UpdatableItemAttributesGtin.h
 *
 * The unique universal product identifier.
 */

#ifndef TINY_CPP_CLIENT_UpdatableItemAttributesGtin_H_
#define TINY_CPP_CLIENT_UpdatableItemAttributesGtin_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The unique universal product identifier.
 *
 *  \ingroup Models
 *
 */

class UpdatableItemAttributesGtin{
public:

    /*! \brief Constructor.
	 */
    UpdatableItemAttributesGtin();
    UpdatableItemAttributesGtin(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatableItemAttributesGtin();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_UpdatableItemAttributesGtin_H_ */

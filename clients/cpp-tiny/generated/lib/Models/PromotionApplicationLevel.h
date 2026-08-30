
/*
 * PromotionApplicationLevel.h
 *
 * Specify if the promotion is applied at ad group or item level.
 */

#ifndef TINY_CPP_CLIENT_PromotionApplicationLevel_H_
#define TINY_CPP_CLIENT_PromotionApplicationLevel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Specify if the promotion is applied at ad group or item level.
 *
 *  \ingroup Models
 *
 */

class PromotionApplicationLevel{
public:

    /*! \brief Constructor.
	 */
    PromotionApplicationLevel();
    PromotionApplicationLevel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromotionApplicationLevel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PromotionApplicationLevel_H_ */

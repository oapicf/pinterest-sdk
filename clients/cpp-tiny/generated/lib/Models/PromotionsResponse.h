
/*
 * PromotionsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PromotionsResponse_H_
#define TINY_CPP_CLIENT_PromotionsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PromotionArrayElement.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PromotionsResponse{
public:

    /*! \brief Constructor.
	 */
    PromotionsResponse();
    PromotionsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromotionsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<PromotionArrayElement> getPromotions();

	/*! \brief Set 
	 */
	void setPromotions(std::list <PromotionArrayElement> promotions);


    private:
    std::list<PromotionArrayElement> promotions;
};
}

#endif /* TINY_CPP_CLIENT_PromotionsResponse_H_ */

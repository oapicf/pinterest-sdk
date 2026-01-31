/*
 * PromotionsResponse.h
 *
 * 
 */

#ifndef _PromotionsResponse_H_
#define _PromotionsResponse_H_


#include <string>
#include "PromotionArrayElement.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PromotionsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	PromotionsResponse();
	PromotionsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromotionsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<PromotionArrayElement> getPromotions();

	/*! \brief Set 
	 */
	void setPromotions(std::list <PromotionArrayElement> promotions);

private:
	std::list <PromotionArrayElement>promotions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromotionsResponse_H_ */

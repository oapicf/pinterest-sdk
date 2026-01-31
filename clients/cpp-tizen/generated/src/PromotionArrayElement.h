/*
 * PromotionArrayElement.h
 *
 * 
 */

#ifndef _PromotionArrayElement_H_
#define _PromotionArrayElement_H_


#include <string>
#include "Exception.h"
#include "PromotionResponse.h"
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

class PromotionArrayElement : public Object {
public:
	/*! \brief Constructor.
	 */
	PromotionArrayElement();
	PromotionArrayElement(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromotionArrayElement();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PromotionResponse getData();

	/*! \brief Set 
	 */
	void setData(PromotionResponse  data);
	/*! \brief Get 
	 */
	Exception getException();

	/*! \brief Set 
	 */
	void setException(Exception  exception);

private:
	PromotionResponse data;
	Exception exception;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromotionArrayElement_H_ */

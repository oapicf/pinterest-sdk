/*
 * AdArrayResponseElement.h
 *
 * 
 */

#ifndef _AdArrayResponseElement_H_
#define _AdArrayResponseElement_H_


#include <string>
#include "AdResponse.h"
#include "Exception.h"
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

class AdArrayResponseElement : public Object {
public:
	/*! \brief Constructor.
	 */
	AdArrayResponseElement();
	AdArrayResponseElement(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdArrayResponseElement();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AdResponse getData();

	/*! \brief Set 
	 */
	void setData(AdResponse  data);
	/*! \brief Get 
	 */
	Exception getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Exception  exceptions);

private:
	AdResponse data;
	Exception exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdArrayResponseElement_H_ */

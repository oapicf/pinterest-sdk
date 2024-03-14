/*
 * AdGroupArrayResponseElement.h
 *
 * 
 */

#ifndef _AdGroupArrayResponseElement_H_
#define _AdGroupArrayResponseElement_H_


#include <string>
#include "AdGroupResponse.h"
#include "Exception.h"
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

class AdGroupArrayResponseElement : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupArrayResponseElement();
	AdGroupArrayResponseElement(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupArrayResponseElement();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AdGroupResponse getData();

	/*! \brief Set 
	 */
	void setData(AdGroupResponse  data);
	/*! \brief Get 
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);

private:
	AdGroupResponse data;
	std::list <Exception>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupArrayResponseElement_H_ */

/*
 * AdGroupArrayResponse.h
 *
 * 
 */

#ifndef _AdGroupArrayResponse_H_
#define _AdGroupArrayResponse_H_


#include <string>
#include "AdGroupArrayResponseElement.h"
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

class AdGroupArrayResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupArrayResponse();
	AdGroupArrayResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupArrayResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdGroupArrayResponseElement> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdGroupArrayResponseElement> items);

private:
	std::list <AdGroupArrayResponseElement>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupArrayResponse_H_ */

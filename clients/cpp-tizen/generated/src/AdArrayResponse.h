/*
 * AdArrayResponse.h
 *
 * 
 */

#ifndef _AdArrayResponse_H_
#define _AdArrayResponse_H_


#include <string>
#include "AdArrayResponseElement.h"
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

class AdArrayResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdArrayResponse();
	AdArrayResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdArrayResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdArrayResponseElement> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdArrayResponseElement> items);

private:
	std::list <AdArrayResponseElement>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdArrayResponse_H_ */

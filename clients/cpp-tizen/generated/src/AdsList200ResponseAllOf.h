/*
 * Ads_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Ads_list_200_response_allOf_H_
#define _Ads_list_200_response_allOf_H_


#include <string>
#include "AdResponse.h"
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

class Ads_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Ads_list_200_response_allOf();
	Ads_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ads_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdResponse> items);

private:
	std::list <AdResponse>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ads_list_200_response_allOf_H_ */

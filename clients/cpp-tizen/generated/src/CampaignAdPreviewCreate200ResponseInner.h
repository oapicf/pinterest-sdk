/*
 * Campaign_ad_preview_create_200_response_inner.h
 *
 * 
 */

#ifndef _Campaign_ad_preview_create_200_response_inner_H_
#define _Campaign_ad_preview_create_200_response_inner_H_


#include <string>
#include "Campaign_ad_preview_create_200_response_inner_data.h"
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

class Campaign_ad_preview_create_200_response_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Campaign_ad_preview_create_200_response_inner();
	Campaign_ad_preview_create_200_response_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Campaign_ad_preview_create_200_response_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Campaign_ad_preview_create_200_response_inner_data getData();

	/*! \brief Set 
	 */
	void setData(Campaign_ad_preview_create_200_response_inner_data  data);

private:
	Campaign_ad_preview_create_200_response_inner_data data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Campaign_ad_preview_create_200_response_inner_H_ */

/*
 * Campaign_ad_preview_create_200_response_inner_data_oneOf.h
 *
 * 
 */

#ifndef _Campaign_ad_preview_create_200_response_inner_data_oneOf_H_
#define _Campaign_ad_preview_create_200_response_inner_data_oneOf_H_


#include <string>
#include "Pinterest.Lib.Error.h"
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

class Campaign_ad_preview_create_200_response_inner_data_oneOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Campaign_ad_preview_create_200_response_inner_data_oneOf();
	Campaign_ad_preview_create_200_response_inner_data_oneOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Campaign_ad_preview_create_200_response_inner_data_oneOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Pinterest.Lib.Error getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Pinterest.Lib.Error  exceptions);

private:
	Pinterest.Lib.Error exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Campaign_ad_preview_create_200_response_inner_data_oneOf_H_ */

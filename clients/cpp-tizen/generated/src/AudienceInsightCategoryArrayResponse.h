/*
 * AudienceInsightCategoryArrayResponse.h
 *
 * 
 */

#ifndef _AudienceInsightCategoryArrayResponse_H_
#define _AudienceInsightCategoryArrayResponse_H_


#include <string>
#include "AudienceInsightCategoryCommon.h"
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

class AudienceInsightCategoryArrayResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceInsightCategoryArrayResponse();
	AudienceInsightCategoryArrayResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceInsightCategoryArrayResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AudienceInsightCategoryCommon> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AudienceInsightCategoryCommon> items);

private:
	std::list <AudienceInsightCategoryCommon>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceInsightCategoryArrayResponse_H_ */

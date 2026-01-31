/*
 * AdGroupIdFilter.h
 *
 * 
 */

#ifndef _AdGroupIdFilter_H_
#define _AdGroupIdFilter_H_


#include <string>
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

class AdGroupIdFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupIdFilter();
	AdGroupIdFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupIdFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of ad group ids
	 */
	std::list<std::string> getAdGroupIds();

	/*! \brief Set List of ad group ids
	 */
	void setAdGroupIds(std::list <std::string> ad_group_ids);

private:
	std::list <std::string>ad_group_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupIdFilter_H_ */

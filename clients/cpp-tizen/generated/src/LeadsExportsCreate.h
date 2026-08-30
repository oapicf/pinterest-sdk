/*
 * LeadsExportsCreate.h
 *
 * Resource create operation model.
 */

#ifndef _LeadsExportsCreate_H_
#define _LeadsExportsCreate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LeadsExportsCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadsExportsCreate();
	LeadsExportsCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadsExportsCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID for the ad collecting leads.
	 */
	std::string getAdId();

	/*! \brief Set ID for the ad collecting leads.
	 */
	void setAdId(std::string  ad_id);
	/*! \brief Get Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
	 */
	std::string getEndDate();

	/*! \brief Set Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
	 */
	void setEndDate(std::string  end_date);
	/*! \brief Get Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
	 */
	std::string getStartDate();

	/*! \brief Set Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
	 */
	void setStartDate(std::string  start_date);

private:
	std::string ad_id;
	std::string end_date;
	std::string start_date;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadsExportsCreate_H_ */

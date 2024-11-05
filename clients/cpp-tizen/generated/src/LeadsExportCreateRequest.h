/*
 * LeadsExportCreateRequest.h
 *
 * 
 */

#ifndef _LeadsExportCreateRequest_H_
#define _LeadsExportCreateRequest_H_


#include <string>
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

class LeadsExportCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadsExportCreateRequest();
	LeadsExportCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadsExportCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
	 */
	std::string getStartDate();

	/*! \brief Set Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
	 */
	void setStartDate(std::string  start_date);
	/*! \brief Get Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
	 */
	std::string getEndDate();

	/*! \brief Set Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
	 */
	void setEndDate(std::string  end_date);
	/*! \brief Get ID for the ad collecting leads
	 */
	std::string getAdId();

	/*! \brief Set ID for the ad collecting leads
	 */
	void setAdId(std::string  ad_id);

private:
	std::string start_date;
	std::string end_date;
	std::string ad_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadsExportCreateRequest_H_ */

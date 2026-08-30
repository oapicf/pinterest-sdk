
/*
 * LeadsExportsCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_LeadsExportsCreate_H_
#define TINY_CPP_CLIENT_LeadsExportsCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LeadsExportsCreate{
public:

    /*! \brief Constructor.
	 */
    LeadsExportsCreate();
    LeadsExportsCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadsExportsCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID for the ad collecting leads.
	 */
	std::string getAdId();

	/*! \brief Set ID for the ad collecting leads.
	 */
	void setAdId(std::string ad_id);
	/*! \brief Get Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
	 */
	std::string getEndDate();

	/*! \brief Set Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
	 */
	void setEndDate(std::string end_date);
	/*! \brief Get Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
	 */
	std::string getStartDate();

	/*! \brief Set Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
	 */
	void setStartDate(std::string start_date);


    private:
    std::string ad_id{};
    std::string end_date{};
    std::string start_date{};
};
}

#endif /* TINY_CPP_CLIENT_LeadsExportsCreate_H_ */

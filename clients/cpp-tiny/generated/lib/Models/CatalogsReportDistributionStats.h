
/*
 * CatalogsReportDistributionStats.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsReportDistributionStats_H_
#define TINY_CPP_CLIENT_CatalogsReportDistributionStats_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReportDistributionStats{
public:

    /*! \brief Constructor.
	 */
    CatalogsReportDistributionStats();
    CatalogsReportDistributionStats(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReportDistributionStats();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID of the catalog entity.
	 */
	std::string getCatalogId();

	/*! \brief Set ID of the catalog entity.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get The event code that a diagnostics aggregated number references
	 */
	int getCode();

	/*! \brief Set The event code that a diagnostics aggregated number references
	 */
	void setCode(int  code);
	/*! \brief Get A human-friendly label for the event code (e.g, 'SPAM')
	 */
	std::string getCodeLabel();

	/*! \brief Set A human-friendly label for the event code (e.g, 'SPAM')
	 */
	void setCodeLabel(std::string  code_label);
	/*! \brief Get Indicates if issue makes items ineligible for ads distribution
	 */
	bool isIneligibleForAds();

	/*! \brief Set Indicates if issue makes items ineligible for ads distribution
	 */
	void setIneligibleForAds(bool  ineligible_for_ads);
	/*! \brief Get Indicates if issue makes items ineligible for organic distribution
	 */
	bool isIneligibleForOrganic();

	/*! \brief Set Indicates if issue makes items ineligible for organic distribution
	 */
	void setIneligibleForOrganic(bool  ineligible_for_organic);
	/*! \brief Get Title message describing the diagnostic issue
	 */
	std::string getMessage();

	/*! \brief Set Title message describing the diagnostic issue
	 */
	void setMessage(std::string  message);
	/*! \brief Get Number of occurrences of the issue
	 */
	int getOccurrences();

	/*! \brief Set Number of occurrences of the issue
	 */
	void setOccurrences(int  occurrences);
	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);


    private:
    std::string catalog_id{};
    int code{};
    std::string code_label{};
    bool ineligible_for_ads{};
    bool ineligible_for_organic{};
    std::string message{};
    int occurrences{};
    std::string report_type{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsReportDistributionStats_H_ */

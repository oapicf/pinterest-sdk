
/*
 * CatalogsReportFeedIngestionStats.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsReportFeedIngestionStats_H_
#define TINY_CPP_CLIENT_CatalogsReportFeedIngestionStats_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReportFeedIngestionStats{
public:

    /*! \brief Constructor.
	 */
    CatalogsReportFeedIngestionStats();
    CatalogsReportFeedIngestionStats(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReportFeedIngestionStats();


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
	void setCatalogId(std::string catalog_id);
	/*! \brief Get The event code that a diagnostics aggregated number references
	 */
	int getCode();

	/*! \brief Set The event code that a diagnostics aggregated number references
	 */
	void setCode(int code);
	/*! \brief Get A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
	 */
	std::string getCodeLabel();

	/*! \brief Set A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
	 */
	void setCodeLabel(std::string code_label);
	/*! \brief Get Title message describing the diagnostic issue
	 */
	std::string getMessage();

	/*! \brief Set Title message describing the diagnostic issue
	 */
	void setMessage(std::string message);
	/*! \brief Get Number of occurrences of the issue
	 */
	int getOccurrences();

	/*! \brief Set Number of occurrences of the issue
	 */
	void setOccurrences(int occurrences);
	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string report_type);
	/*! \brief Get An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
	 */
	std::string getSeverity();

	/*! \brief Set An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
	 */
	void setSeverity(std::string severity);


    private:
    std::string catalog_id{};
    int code{};
    std::string code_label{};
    std::string message{};
    int occurrences{};
    std::string report_type{};
    std::string severity{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsReportFeedIngestionStats_H_ */

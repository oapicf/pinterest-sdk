/*
 * CatalogsReportFeedIngestionStats.h
 *
 * 
 */

#ifndef _CatalogsReportFeedIngestionStats_H_
#define _CatalogsReportFeedIngestionStats_H_


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

class CatalogsReportFeedIngestionStats : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsReportFeedIngestionStats();
	CatalogsReportFeedIngestionStats(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsReportFeedIngestionStats();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);
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
	/*! \brief Get A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
	 */
	std::string getCodeLabel();

	/*! \brief Set A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
	 */
	void setCodeLabel(std::string  code_label);
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
	/*! \brief Get An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
	 */
	std::string getSeverity();

	/*! \brief Set An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
	 */
	void setSeverity(std::string  severity);

private:
	std::string report_type;
	std::string catalog_id;
	int code;
	std::string code_label;
	std::string message;
	int occurrences;
	std::string severity;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsReportFeedIngestionStats_H_ */

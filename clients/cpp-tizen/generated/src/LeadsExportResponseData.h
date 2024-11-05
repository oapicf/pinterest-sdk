/*
 * LeadsExportResponseData.h
 *
 * 
 */

#ifndef _LeadsExportResponseData_H_
#define _LeadsExportResponseData_H_


#include <string>
#include "LeadsExportStatus.h"
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

class LeadsExportResponseData : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadsExportResponseData();
	LeadsExportResponseData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadsExportResponseData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	LeadsExportStatus getExportStatus();

	/*! \brief Set 
	 */
	void setExportStatus(LeadsExportStatus  export_status);
	/*! \brief Get 
	 */
	std::string getDownloadUrl();

	/*! \brief Set 
	 */
	void setDownloadUrl(std::string  download_url);

private:
	LeadsExportStatus export_status;
	std::string download_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadsExportResponseData_H_ */
